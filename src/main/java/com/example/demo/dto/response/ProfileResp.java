package com.example.demo.dto.response;

import lombok.Builder;
import lombok.Data;
import java.io.Serializable;

@Data
@Builder
public class ProfileResp implements Serializable {

    private String name;
    private Integer age;
}
