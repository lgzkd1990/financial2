package com.zl.financial.controller;

import com.zl.financial.entity.TestUser;
import com.zl.financial.service.TestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    TestUserService service;

    @RequestMapping("/bye")
    public TestUser findOne() {
        TestUser user = service.findOne("1");
        return user;
    }
}
