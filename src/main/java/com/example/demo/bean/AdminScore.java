package com.example.demo.bean;

import lombok.Data;

//学生界面的成绩
@Data
public class AdminScore {
    int sno;
    String sname;
    int cno;
    String cname;
    String tname;
    int score;
    String term;
}
