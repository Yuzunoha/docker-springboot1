package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class LambdaService {
    public String test() {
        var bird = Factory.create();
        bird.fly();
        return "";
    }
}

interface Flyable {
    public void fly();
}

class Factory {
    // 自身のインスタンスを生成し、Flyable型として返す
    public static Flyable create() {
        return (new Factory()).new InnerSample();
    }

    // インナークラス
    private class InnerSample implements Flyable {
        @Override
        public void fly() {
            System.out.println("飛びます");
        }
    }
}
