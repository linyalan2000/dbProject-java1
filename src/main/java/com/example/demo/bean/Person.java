package com.example.demo.bean;

import lombok.Data;

@Data
public class Person {
     String name;
     String pass;
     String privilege;

    public String getPass() {
        return pass;
    }

    public String getName() {
        return name;
    }

    public String getPrivilege() {
        return privilege;
    }

    public Person(){
        name = null;
        pass = null;
        privilege = null;
    }

}

