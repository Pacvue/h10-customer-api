package com.pacvue.h10.customer.api.exception;

import com.pacvue.common.error.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class CustomErrorCode implements ErrorCode {

    private int code;

    private String message;

    private String name;

    private List<String> loginUrl;

    public CustomErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int code() {
        return 0;
    }

    @Override
    public String message() {
        return "";
    }
}
