package com.pacvue.h10.customer.api.infrastructure.config;

import com.pacvue.h10.customer.api.exception.AuthenticateException;
import com.pacvue.h10.customer.api.exception.BusinessException;
import com.pacvue.h10.customer.api.exception.CustomErrorCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.resource.NoResourceFoundException;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 业务异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(BusinessException.class)
    @ResponseStatus(HttpStatus.OK)
    public CustomErrorCode handleBusinessException(BusinessException e) {
        log.error("GlobalExceptionAdvisor.handleOrderException", e);
        return e.getErrorCode();
    }

    /**
     * 认证异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(AuthenticateException.class)
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public CustomErrorCode handleAuthenticateException(AuthenticateException e) {
        log.error("GlobalExceptionAdvisor.handleOrderException", e);
        return e.getErrorCode();
    }

    /**
     * 系统异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(NoResourceFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public CustomErrorCode handleNoResourceFoundException(NoResourceFoundException e) {
        log.error("GlobalExceptionAdvisor.handleException", e);
        return new CustomErrorCode(404, e.getMessage());
    }

    /**
     * 系统异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public CustomErrorCode handleException(Exception e) {
        log.error("GlobalExceptionAdvisor.handleException", e);
        return new CustomErrorCode(500, e.getMessage());
    }
}
