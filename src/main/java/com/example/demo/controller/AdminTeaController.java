package com.example.demo.controller;

import com.example.demo.bean.AdminTea;
import com.example.demo.service.AdminTeaService;
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
public class AdminTeaController {
    @Autowired
    JdbcTemplate jdbctemplate;

    @Autowired
    AdminTeaService adminTeaService;

    @ResponseBody
    @GetMapping("/gettea")
    public List<AdminTea> getTea(@RequestParam("tno") String tno){
        log.info(tno);
        if (!tno.equals(""))
            return adminTeaService.getInfo(Integer.valueOf(tno));
        else
            return adminTeaService.getInfo(-1);
    }

    @ResponseBody
    @PostMapping(path = "/addteacher")
    public int addTea(RequestEntity requestEntity){
        LinkedHashMap<String, String> msg = (LinkedHashMap<String, String>) requestEntity.getBody();
        int tno = Integer.valueOf(msg.get("tno"));
        String tname = msg.get("tname");
        String pass = msg.get("pass");
        String sex = msg.get("tsex");
        String title = msg.get("title");
        int intime = Integer.valueOf(msg.get("hireDate"));
        String privilege = msg.get("root");
        return adminTeaService.addTeacher(tno, tname, title, sex, pass, intime, privilege);
    }

    @ResponseBody
    @PostMapping(path = "/updateteacher")
    public int updateTea(RequestEntity requestEntity){
        LinkedHashMap<String, String> msg = (LinkedHashMap<String, String>) requestEntity.getBody();
        int tno = Integer.valueOf(msg.get("tno"));
        String privilege = msg.get("root");
        String title = msg.get("title");
        return adminTeaService.updateTeacher(tno, title, privilege);
    }
}
