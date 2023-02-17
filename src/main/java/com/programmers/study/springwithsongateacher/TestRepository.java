package com.programmers.study.springwithsongateacher;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class TestRepository {

    // private Map<String, String> db = new HashMap<>();
    // 자바 (자료구조) 컬렉션 중 실무에선 2개만 알면 된다.
    // list(arraylist), map(hashmap) 공부하기

    public String test(){
        return "test";
    }
}
