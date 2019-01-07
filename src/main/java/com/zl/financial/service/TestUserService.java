package com.zl.financial.service;

import com.zl.financial.dao.TestUserDao;
import com.zl.financial.entity.TestUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestUserService {

    @Autowired
    TestUserDao testUserDao;

    public List<TestUser> findAll(){
        return  testUserDao.findAll();
    }
    public TestUser findOne(String id){
        return  testUserDao.findById(id).orElse(null);
    }
}
