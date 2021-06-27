package com.example.demo.service;

import com.example.demo.bean.Course;
import com.example.demo.bean.Score;
import com.example.demo.mapper.CourseMapper;
import com.example.demo.mapper.ScoreMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ScoreService {
    @Autowired
    ScoreMapper scoreMapper;

    public List<Score> getScore(int cno, int tno) {
        return scoreMapper.getScore(cno, tno);
    }

    public int updateScore(int cno, int sno, int score){
        return scoreMapper.updateScore(cno, sno, score);
    }

}
