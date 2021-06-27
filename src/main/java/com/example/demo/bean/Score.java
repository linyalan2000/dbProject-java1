package com.example.demo.bean;

import lombok.Data;

//学生成绩录入及修改
@Data
public class Score {
    int courseid;
    String courseName;
    int sid;
    String sname;
    int score;
}