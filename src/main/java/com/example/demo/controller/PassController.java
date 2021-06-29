package com.example.demo.controller;

import com.example.demo.service.PassService;
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
public class PassController {
    @Autowired
    JdbcTemplate jdbctemplate;

    @Autowired
    PassService passService;

    @ResponseBody
    @GetMapping("/getPass")
    public String getPass(@RequestParam("id") String id, @RequestParam("pass") String pass){
        return passService.getPass(id);
    }
}
