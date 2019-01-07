package com.zl.financial.dao;

import com.zl.financial.entity.TestUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface TestUserDao  extends CrudRepository<TestUser,String>, JpaRepository<TestUser, String>, JpaSpecificationExecutor<TestUser> {
}
