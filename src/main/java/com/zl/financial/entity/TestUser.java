package com.zl.financial.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
public class TestUser {
    @NonNull
    @Id
    private String name;
    @NonNull
    private String password;


}
