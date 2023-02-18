package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class InnerService {
    public String run() {
        Flyable bird = FlyableFactory.create();
        bird.fly();
        return "";
    }
}

interface Flyable {
    public void fly();
}

class FlyableFactory {
    public static Flyable create() {
        return (new FlyableFactory()).new InnerClass();
    }

    private class InnerClass implements Flyable {
        @Override
        public void fly() {
            System.out.println("Flyableインタフェースのflyメソッドです。");
        }
    }
}
