package com.example.demo.bean;

import lombok.Data;

//管理员看到的教师信息
@Data
public class AdminTea {
    int tno;
    String tname;
    String title;
    int hireDate;
    String root;
    String tel;
}