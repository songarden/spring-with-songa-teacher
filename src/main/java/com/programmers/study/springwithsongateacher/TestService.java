package com.programmers.study.springwithsongateacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    TestRepository tr = new TestRepository();
    public String test() {
        return tr.test();
    }
}
