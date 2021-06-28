package com.example.demo.service;

import com.example.demo.bean.AdminCourse;
import com.example.demo.bean.AdminScore;
import com.example.demo.mapper.AdminCourseMapper;
import com.example.demo.mapper.AdminScoreMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class AdminCourseService {
    @Autowired
    AdminCourseMapper AdminCourseMapper;

    public List<AdminCourse> getAdminCourse(int cno, int tno) {
        return AdminCourseMapper.getAdminCourse(cno, tno);
    }

//    public int insertAdminCourse (int cno, String cname, String academy, int tno, String term){
//
//    }

//    public int updateAdminScore(int cno, int sno, int score){
//        return adminScoreMapper.updateAdminScore(cno, sno, score);
//    }
//
//    public int deleteAdminScore(int cno, int sno){
//        return adminScoreMapper.deleteAdminScore(cno, sno);
//    }

}
