package com.example.demo.mapper;


import com.example.demo.bean.Person;
import com.example.demo.bean.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StuMapper {
    List<Student> getStuInfo(int id);
    int addStu(int sno, String sname, String pass, String sex, String major, int inyear, String telephone);
    int delStu(int sno);
    int updateStu(int sno, String sname, String pass, String sex, String major, int inyear, String telephone);

}
