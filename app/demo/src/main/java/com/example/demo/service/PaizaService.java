package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class PaizaService {
    public String splitAndParse(String in) {
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

    public String splitAndParse() {
        String in = "-1 10 3 101 555555 4";
        return this.splitAndParse(in);
    }
}
