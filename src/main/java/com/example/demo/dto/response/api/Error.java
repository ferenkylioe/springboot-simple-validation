package com.example.demo.dto.response.api;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Error {
    private Integer code;
    private String message;
}
