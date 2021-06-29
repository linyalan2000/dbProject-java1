package com.example.demo.service;

import com.example.demo.bean.AdminTea;
import com.example.demo.bean.Teacher;
import com.example.demo.mapper.AdminTeaMapper;
import com.example.demo.mapper.TeaMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class AdminTeaService {
    @Autowired
    AdminTeaMapper adminTeaMapper;

    public List<AdminTea> getInfo(int tno) {
        return adminTeaMapper.getTea(tno);
    }
    public int addTeacher(int tno, String tname, String title, String sex, String pass, int intime, String privilege){
        return adminTeaMapper.AddTeacher(tno, tname, title, sex, pass, intime, privilege);
    }

    public int updateTeacher(int tno, String title, String privilege) {
        return adminTeaMapper.UpdateTeacher(tno, title, privilege);
    }
    public int delTeacher(int tno){
        return adminTeaMapper.delTeacher(tno);
    }
}
