package com.example.demo.dto.request;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.io.Serializable;

@Data
@Builder
public class ProfileReq implements Serializable {

    @NotBlank(message = "null")
    @Length(min = 3, max = 30, message = "between 3-30 characters")
    private String name;

    @NotNull(message = "null")
    @Min(value = 5, message = "minimum 5")
    @Max(value = 70, message = "maximum 70")
    private Integer age;
}
