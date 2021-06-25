package com.example.demo.controller;

import com.example.demo.bean.Account;
import com.example.demo.bean.Person;
import com.example.demo.bean.Student;
import com.example.demo.service.PassCheckService;
import com.example.demo.service.StuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;

@Slf4j
@Controller
@CrossOrigin //跨域问题
public class StuController {
    @Autowired
    JdbcTemplate jdbctemplate;

    @Autowired
    StuService stuService;

    @ResponseBody
    @GetMapping("/stuinfo")
    public Student getStuInfo(@RequestParam("id") String id){
        return stuService.getInfo(Integer.valueOf(id));
    }

}
