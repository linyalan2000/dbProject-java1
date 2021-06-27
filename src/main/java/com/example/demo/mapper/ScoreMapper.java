package com.example.demo.mapper;


import com.example.demo.bean.Course;
import com.example.demo.bean.Score;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ScoreMapper {
    List<Score> getScore(int cno, int tno);
    int updateScore(int cno, int sno, int score);
}
