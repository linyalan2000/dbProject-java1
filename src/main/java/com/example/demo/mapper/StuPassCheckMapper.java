package com.example.demo.mapper;


import com.example.demo.bean.Person;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StuPassCheckMapper {
    Person getStuPass(int id);
    int editStuPass(int id, String pass);
}
