package com.example.demo.mapper;


import com.example.demo.bean.Student;
import com.example.demo.bean.Teacher;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeaMapper {
    Teacher getTeaInfo(int id);
}
