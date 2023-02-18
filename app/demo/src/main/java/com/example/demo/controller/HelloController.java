package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/index")
    public String index() {
        // 入力文字列１つ
        String in = "-1 10 3 101 555555 4";

        // 文字列を配列に分解する
        String[] a = in.split(" ");

        // int型の入れ物を同じサイズで宣言する
        int[] nums = new int[a.length];

        // すべてパースして詰める
        for (int i = 0; i < a.length; i++) {
            nums[i] = Integer.parseInt(a[i]);
        }

        // 返却用文字列を作って返却する
        StringBuilder sb = new StringBuilder();
        for (var e : nums) {
            System.out.println(e);
            sb.append(e + " ");
        }
        return sb.toString();
    }
}
