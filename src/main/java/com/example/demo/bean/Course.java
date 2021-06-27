package com.example.demo.bean;

import lombok.Data;
//用于展示教师上的所有课
@Data
public class Course {
    int cno;
    String cname;
    String department;
    String tname;
    int stuNum;
}
