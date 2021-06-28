package com.example.demo.mapper;


import com.example.demo.bean.AdminScore;
import com.example.demo.bean.Score;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminScoreMapper {
    List<AdminScore> getAdminScore(int cno, int sno);
    int updateAdminScore(int cno, int sno, int score);
    int deleteAdminScore(int cno, int sno);
    int addAdminScore(int sno, int cno, int tno);
}
