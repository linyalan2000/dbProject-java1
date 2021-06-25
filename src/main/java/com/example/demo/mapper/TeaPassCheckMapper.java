package com.example.demo.mapper;


import com.example.demo.bean.Person;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeaPassCheckMapper {
    Person getTeaPass(int id);
    int editTeaPass(int id, String pass);
}
