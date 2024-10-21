package com.pacvue.h10.customer.api.infrastructure.util;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContexts;

import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/**
 * Common HttpClient
 */
public class CommonHttpClient {

    private static CloseableHttpClient httpClient;

    private static PoolingHttpClientConnectionManager connectionManager;

    /**
     * All max total connections
     */
    private static final int MAX_TOTAL_CONNECTIONS = 20000;

    /**
     * All max connections per route
     */
    private static final int MAX_CONNECTIONS_PER_ROUTE = 200;


    /**
     * Tcp connection timeout
     */
    private static final int CONNECTION_TIMEOUT = 30000;

    /**
     * Tcp socket timeout
     */
    private static final int SOCKET_TIMEOUT = 60000;

    /**
     * Timeout for get connection from pool
     */
    private static final int REQUIRE_CONNECTION_TIMEOUT = 60000;

    /**
     * Idle connection monitor interval
     */
    private static final int INACTIVE_CONNECTION_MONITOR_INTERVAL = 30000;


    public static final String HEADER_CONTENT_TYPE = "Content-Type";

    public static final String APPLICATION_JSON = "application/json";

    /**
     * Supported protocols
     */
    private static final String[] SUPPORTED_PROTOCOLS = new String[] { "TLSv1", "TLSv1.1", "TLSv1.2", "SSLv3" };


    static {
        try {
            SSLContext sslContext = SSLContexts.createDefault();
            X509TrustManager x509TrustManager = new X509TrustManager() {
                @Override
                public void checkClientTrusted(java.security.cert.X509Certificate[] x509Certificates, String s) {
                }
                @Override
                public void checkServerTrusted(java.security.cert.X509Certificate[] x509Certificates, String s) throws CertificateNotYetValidException, CertificateExpiredException {
                    // Check if the certificate is valid
                    Date now = new Date();
                    if (null != x509Certificates) {
                        for (java.security.cert.X509Certificate cert : x509Certificates) {
                            cert.checkValidity(now);
                        }
                    }
                }
                @Override
                public java.security.cert.X509Certificate[] getAcceptedIssuers() {
                    return null;
                }
            };
            sslContext.init(null, new X509TrustManager[] { x509TrustManager }, null);
            SSLConnectionSocketFactory sslConnectionSocketFactory = new SSLConnectionSocketFactory(sslContext, SUPPORTED_PROTOCOLS, null, SSLConnectionSocketFactory.getDefaultHostnameVerifier());
            Registry<ConnectionSocketFactory> socketFactoryRegistry = RegistryBuilder.<ConnectionSocketFactory>create()
                    .register("http", PlainConnectionSocketFactory.getSocketFactory())
                    .register("https", sslConnectionSocketFactory)
                    .build();
            RequestConfig requestConfig = RequestConfig.custom().setConnectionRequestTimeout(REQUIRE_CONNECTION_TIMEOUT)
                    .setConnectTimeout(CONNECTION_TIMEOUT).setSocketTimeout(SOCKET_TIMEOUT)
                    .setRedirectsEnabled(true).build();

            connectionManager = new PoolingHttpClientConnectionManager(socketFactoryRegistry);
            connectionManager.setMaxTotal(MAX_TOTAL_CONNECTIONS);
            connectionManager.setDefaultMaxPerRoute(MAX_CONNECTIONS_PER_ROUTE);
            connectionManager.setValidateAfterInactivity(INACTIVE_CONNECTION_MONITOR_INTERVAL);
            httpClient = HttpClients.custom()
                    .setConnectionManager(connectionManager)
                    .setDefaultRequestConfig(requestConfig)
                    .evictExpiredConnections()
                    .evictIdleConnections(100, TimeUnit.SECONDS)
                    .build();
            ThreadFactory threadFactory = new ThreadFactoryBuilder()
                    .setNameFormat("idle-connection-pool-cleaner-%d").setDaemon(true).build();
            ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1, threadFactory);
            scheduledExecutorService.scheduleAtFixedRate(() -> {
                connectionManager.closeExpiredConnections();
                connectionManager.closeIdleConnections(100, TimeUnit.SECONDS);
            }, 30, 30, TimeUnit.SECONDS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static CloseableHttpClient getHttpClient() {
        return httpClient;
    }
}