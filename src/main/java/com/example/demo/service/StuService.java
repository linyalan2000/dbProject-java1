package com.example.demo.service;

import com.example.demo.bean.Person;
import com.example.demo.bean.Student;
import com.example.demo.mapper.StuMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class StuService {
    @Autowired
    StuMapper stuMapper;

    public Student getInfo(int id) {
        return stuMapper.getStuInfo(id);
    }

}
