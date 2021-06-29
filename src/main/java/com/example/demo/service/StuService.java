package com.example.demo.service;

import com.example.demo.bean.Person;
import com.example.demo.bean.Student;
import com.example.demo.mapper.StuMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class StuService {
    @Autowired
    StuMapper stuMapper;

    public List<Student> getInfo(int id) {
        return stuMapper.getStuInfo(id);
    }
    public int addStu(int sno, String sname, String pass, String sex, String major, int inyear, String telphone){
        return stuMapper.addStu(sno,sname,pass,sex,major,inyear,telphone);
    }
    public int delStu(int sno){
        return stuMapper.delStu(sno);
    }
    public int updateStu(int sno, String sname, String pass, String sex, String major, int inyear, String telphone){
        return stuMapper.updateStu(sno,sname,pass,sex,major,inyear,telphone);
    }

}
