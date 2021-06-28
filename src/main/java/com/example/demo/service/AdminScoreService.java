package com.example.demo.service;

import com.example.demo.bean.AdminScore;
import com.example.demo.bean.Score;
import com.example.demo.mapper.AdminScoreMapper;
import com.example.demo.mapper.ScoreMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class AdminScoreService {
    @Autowired
    AdminScoreMapper adminScoreMapper;

    public List<AdminScore> getAdminScore(int cno, int sno) {
        return adminScoreMapper.getAdminScore(cno, sno);
    }

    public int updateAdminScore(int cno, int sno, int score){
        return adminScoreMapper.updateAdminScore(cno, sno, score);
    }

    public int deleteAdminScore(int cno, int sno){
        return adminScoreMapper.deleteAdminScore(cno, sno);
    }

    public int addAdminScore(int sno, int cno, int tno){
        return adminScoreMapper.addAdminScore(sno, cno, tno);
    }

}
