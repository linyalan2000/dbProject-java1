package com.example.demo.service;

import com.example.demo.bean.Score;
import com.example.demo.bean.StuScore;
import com.example.demo.mapper.ScoreMapper;
import com.example.demo.mapper.StuScoreMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class StuScoreService {
    @Autowired
    StuScoreMapper stuScoreMapper;

    public List<StuScore> getStuScore(int cno, int sno, String term) {
        return stuScoreMapper.getStuScore(cno, sno, term);
    }


}
