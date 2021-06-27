package com.example.demo.service;

import com.example.demo.bean.Student;
import com.example.demo.bean.Teacher;
import com.example.demo.mapper.StuMapper;
import com.example.demo.mapper.TeaMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TeaService {
    @Autowired
    TeaMapper teaMapper;

    public Teacher getInfo(int id) {
        return teaMapper.getTeaInfo(id);
    }

}
