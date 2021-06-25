package com.example.demo.service;

import com.example.demo.mapper.PassCheckMapper;
import com.example.demo.mapper.PassMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PassCheckService {
    @Autowired
    PassCheckMapper passCheckMapper;

    public String getPass(String id) {
        return passCheckMapper.getPass(id);
    }
}
