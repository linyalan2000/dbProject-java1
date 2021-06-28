package com.example.demo.bean;

import lombok.Data;

//管理员看到的课程界面
@Data
public class AdminCourse {
    int cno;
    String cname;
    String academy;
    String tname;
    int stunum;
    String term;
}
