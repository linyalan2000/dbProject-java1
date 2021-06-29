package com.example.demo.mapper;


import com.example.demo.bean.AdminTea;
import com.example.demo.bean.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminTeaMapper {
    List<AdminTea> getTea(int tno);
    int AddTeacher(int tno, String tname, String title, String sex, String pass, int intime, String privilege);
    int UpdateTeacher(int tno, String title, String privilege);
    int delTeacher(int tno);
}
