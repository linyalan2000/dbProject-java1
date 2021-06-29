package com.example.demo.controller;

import com.example.demo.bean.Student;
import com.example.demo.service.StuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;

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
    public List<Student> getStuInfo(@RequestParam("id") String id){
        if (id.equals(""))
        return stuService.getInfo(-1);
        else
            return stuService.getInfo(Integer.valueOf(id));
    }


    @ResponseBody
    @PostMapping("/addstu")
    public int addAdminScore(RequestEntity requestEntity) {
        LinkedHashMap<String, String> msg = (LinkedHashMap<String, String>) requestEntity.getBody();
        int sno = Integer.valueOf(msg.get("sno"));
        String sname = msg.get("sname");
        String pass = msg.get("pass");
        String sex = msg.get("sex");
        String major = msg.get("major");
        String tel = msg.get("tel");
        int inyear = Integer.valueOf(msg.get("inyear"));
        return stuService.addStu(sno, sname, pass, sex, major, inyear, tel);
    }

    @ResponseBody
    @PostMapping("/delstu")
    public int delAdminScore(RequestEntity requestEntity) {
        LinkedHashMap<String, String> msg = (LinkedHashMap<String, String>) requestEntity.getBody();
        int sno = Integer.valueOf(msg.get("sno"));
        return stuService.delStu(sno);
    }

    @ResponseBody
    @PostMapping("/updatestu")
    public int updateAdminScore(RequestEntity requestEntity) {
        LinkedHashMap<String, String> msg = (LinkedHashMap<String, String>) requestEntity.getBody();
        int sno = Integer.valueOf(msg.get("sno"));
        String sname = msg.get("sname");
        String pass = msg.get("pass");
        String sex = msg.get("sex");
        String major = msg.get("major");
        String tel = msg.get("tel");
        int inyear = Integer.valueOf(msg.get("inyear"));
        return stuService.updateStu(sno, sname, pass, sex, major, inyear, tel);
    }
}

