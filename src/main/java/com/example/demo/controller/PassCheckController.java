package com.example.demo.controller;

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
    PassService passService;

    @ResponseBody
    @PostMapping(path = "/post")
    public HashMap<String, String> getPass(RequestEntity requestEntity){
        LinkedHashMap<String, String> msg = (LinkedHashMap<String, String>) requestEntity.getBody();
        log.info(msg.get("stu"));
        HashMap<String, String> params = new HashMap<>();
        String a = "2322";
        params.put("date", a);
        params.put("typeId", "dsafa");
        return params;
    }
}
