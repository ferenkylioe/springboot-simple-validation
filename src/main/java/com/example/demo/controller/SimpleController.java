package com.example.demo.controller;

import com.example.demo.dto.request.ProfileReq;
import com.example.demo.dto.response.ProfileResp;
import com.example.demo.dto.response.api.ApiResponse;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class SimpleController {

    @PostMapping(value = "/submit/profile")
    public ApiResponse<ProfileResp> submitProfile(@RequestBody @Valid ProfileReq req) {
        ProfileResp profile = ProfileResp.builder().name(req.getName()).age(req.getAge()).build();

        return ApiResponse.success(profile);
    }
}
