package com.pacvue.h10.customer.api.exception;

public enum ExceptionEnum {

  // system error
  ERROR(500, "server error"),
  PARAM_ERROR(400, "parameter error"),
  NOT_FOUND(404, "not found error"),
  UNAUTHORIZED(401, "no authorized"),
  FORBIDDEN(403, "forbidden"),
  METHOD_NOT_ALLOWED(405, "not allowed method"),
  UNSUPPORTED_MEDIA_TYPE(415, "not supported media type"),
  INTERNAL_SERVER_ERROR(500, "internal server error"),
  BAD_GATEWAY(502, "gateway error"),
  SERVICE_UNAVAILABLE(503, "service unavailable"),
  GATEWAY_TIMEOUT(504, "gate timeout"),

  // business error
  POSTGRESQL_ADD_ERROR(1001, "postgresql add error"),
  POSTGRESQL_DELETE_ERROR(1002, "postgresql delete error"),
  POSTGRESQL_UPDATE_ERROR(1003, "postgresql update error"),
  POSTGRESQL_QUERY_ERROR(1004, "postgresql query error"),
  CLICKHOUSE_ADD_ERROR(1005, "clickhouse add error"),
  CLICKHOUSE_DELETE_ERROR(1006, "clickhouse delete error"),
  CLICKHOUSE_UPDATE_ERROR(1007, "clickhouse update error"),
  CLICKHOUSE_QUERY_ERROR(1008, "clickhouse query error");

  private final int code;
  private final String message;

  ExceptionEnum(int code, String message) {
    this.code = code;
    this.message = message;
  }

  public int getCode() {
    return code;
  }

  public String getMessage() {
    return message;
  }
}
