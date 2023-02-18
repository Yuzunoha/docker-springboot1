package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.PaizaService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/hello")
public class HelloController {

    private final PaizaService paizaService;

    @GetMapping("/index")
    public String index() {
        return paizaService.splitAndParse();
    }
}
