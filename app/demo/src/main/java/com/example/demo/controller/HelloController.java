package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.InnerService;
import com.example.demo.service.LambdaService;
import com.example.demo.service.PaizaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hello")
public class HelloController {

    private final PaizaService paizaService;
    private final LambdaService lambdaService;
    private final InnerService innerService;

    @GetMapping("/index")
    public String index() {
        return paizaService.splitAndParse();
    }

    @GetMapping("/test")
    public String test() {
        return lambdaService.test();
    }

    @GetMapping("/inner")
    public String inner() {
        return innerService.run();
    }
}
