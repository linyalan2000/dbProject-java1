package com.example.demo.service;

import com.example.demo.bean.Account;
import com.example.demo.mapper.AccountMapper;
import com.example.demo.mapper.PassMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PassService {
    @Autowired
    PassMapper passMapper;

    public String getPass(String id) {
        return passMapper.getPass(id);
    }
}
