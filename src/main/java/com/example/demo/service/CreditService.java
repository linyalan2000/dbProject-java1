package com.example.demo.service;

import com.example.demo.bean.Score;
import com.example.demo.mapper.CreditMapper;
import com.example.demo.mapper.ScoreMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CreditService {
    @Autowired
    CreditMapper creditMapper;

    public int getCredit(int sno) {
        return creditMapper.getCredit(sno);
    }



}
