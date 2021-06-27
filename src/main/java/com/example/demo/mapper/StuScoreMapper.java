package com.example.demo.mapper;


import com.example.demo.bean.Score;
import com.example.demo.bean.StuScore;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StuScoreMapper {
    List<StuScore> getStuScore(int cno, int sno, String term);
}