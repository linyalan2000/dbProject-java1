package com.example.demo.controller;

import com.example.demo.bean.Person;
import com.example.demo.service.PassCheckService;
import com.example.demo.service.PassService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.LinkedHashMap;

@Slf4j
@Controller
@CrossOrigin //跨域问题
public class PassCheckController {
    @Autowired
    JdbcTemplate jdbctemplate;

    @Autowired
    PassCheckService passCheckService;

    @ResponseBody
    @PostMapping(path = "/checklogin")
    public Person getPass(RequestEntity requestEntity){
        LinkedHashMap<String, String> msg = (LinkedHashMap<String, String>) requestEntity.getBody();
        int id = Integer.valueOf(msg.get("stu"));
        String pass = msg.get("pass");
        String p = msg.get("permissionId");
        return passCheckService.getPass(id, pass, p);
    }

    @ResponseBody
    @PostMapping(path = "/editpass")
    public int editPass(RequestEntity requestEntity){
        LinkedHashMap<String, String> msg = (LinkedHashMap<String, String>) requestEntity.getBody();
        int id = Integer.valueOf(msg.get("stu"));
        String pass = msg.get("pass");
        String p = msg.get("permissionId");
        return passCheckService.editPass(id, pass, p);
    }
}
