package com.programmers.study.springwithsongateacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestService ts;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        return ts.test();
    }

    @RequestMapping("/apple")
    public String apple(){
        return "apple";
    }
}
