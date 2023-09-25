package com.example.demo.dto.response.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ApiResponse<T> {
    private boolean success = true;
    private T data;
    private Error error;

    public static <T> ApiResponse<T> success(T data) {
        ApiResponse<T> r = new ApiResponse();
        r.setData(data);
        r.setSuccess(true);

        return r;
    }

    public static <T> ApiResponse<T> error(Integer code, String message) {
        Error error = Error.builder().code(code).message(message).build();

        ApiResponse<T> r = new ApiResponse();
        r.setError(error);
        r.setSuccess(false);

        return r;
    }
}
