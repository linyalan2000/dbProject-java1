package com.example.demo.controller;

import com.example.demo.bean.Account;
import com.example.demo.service.AccountService;
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
@CrossOrigin
public class IndexController {
    @Autowired
    JdbcTemplate jdbctemplate;

    @Autowired
    AccountService accountService;

    @ResponseBody
    @GetMapping("/acct")
    public Account getByid(@RequestParam("id") Long id){
        return accountService.getAcctByid(id);
    }
}
