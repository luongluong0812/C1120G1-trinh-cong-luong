package com.example.repository;

import java.util.HashMap;
import java.util.Map;

public class WordIPLM implements Word {
    static Map<String, String> map = new HashMap<>();

    static {
        map.put("chao", "hello");
        map.put("yeu", "love");
        map.put("nho", "miss");
    }

    @Override
    public String result(String key) {
        boolean check = false;
        String res = "";
        for (Map.Entry<String, String> item : map.entrySet()) {
            if (item.getKey().equals(key)) {
                check = true;
                res= item.getValue();
            }
        } if (!check) return "ko co";
        else return res;
    }
}