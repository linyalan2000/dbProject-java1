package com.example.demo.controller;

import com.example.demo.bean.Student;
import com.example.demo.bean.Teacher;
import com.example.demo.service.StuService;
import com.example.demo.service.TeaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
@CrossOrigin //跨域问题
public class TeaController {
    @Autowired
    JdbcTemplate jdbctemplate;

    @Autowired
    TeaService teaService;

    @ResponseBody
    @GetMapping("/teainfo")
    public Teacher getTeaInfo(@RequestParam("id") String id){
        return teaService.getInfo(Integer.valueOf(id));
    }

}
