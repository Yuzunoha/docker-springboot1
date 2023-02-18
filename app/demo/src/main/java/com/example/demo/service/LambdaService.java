package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class LambdaService {
    public String test() {
        String className = (new Object() {
        }).getClass().getEnclosingClass().getName();
        String methodName = (new Object() {
        }).getClass().getEnclosingMethod().getName();
        return "className: " + className + ", methodName: " + methodName;
    }
}
