package com.pacvue.h10.customer.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseData<T> implements Serializable {
    private T results;
    private int code;

    private String msg;


    private long timestamp;
    private static <T> ResponseData<T> of(int code, String msg, T results) {
        ResponseData<T> result = new ResponseData<>();
        result.code = code;
        result.msg = msg;
        result.results = results;
        result.timestamp=System.currentTimeMillis();
        return result;
    }

    public static <T> ResponseData<T> success(T results) {
        return of(200, "success", results);
    }
}
