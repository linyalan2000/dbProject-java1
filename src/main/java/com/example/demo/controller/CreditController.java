package com.example.demo.controller;


import com.example.demo.bean.Score;
import com.example.demo.service.CreditService;
import com.example.demo.service.ScoreService;
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
public class CreditController {
    @Autowired
    JdbcTemplate jdbctemplate;

    @Autowired
    CreditService creditService;

    @ResponseBody
    @GetMapping("/getcredit")
    public int getCredit(@RequestParam("sno") String sno){
        return creditService.getCredit(Integer.valueOf(sno));
    }

}
