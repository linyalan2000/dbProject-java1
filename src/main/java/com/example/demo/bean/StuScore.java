package com.example.demo.bean;

import lombok.Data;

//学生界面的成绩
@Data
public class StuScore {
    int courseid;
    String courseName;
    String academy;
    String mainTeacher;
    int score;
    int credit;
    String term;
}
