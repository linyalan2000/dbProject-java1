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
    AdminCourseMapper adminCourseMapper;

    public List<AdminCourse> getAdminCourse(int cno, int tno) {
        return adminCourseMapper.getAdminCourse(cno, tno);
    }

    public int insertAdminCourse (int cno, int tno, String cname, String acedamy, String term, String credit){
        return adminCourseMapper.AddAdminCourse(cno, tno, cname, acedamy, term, credit);
    }

    public int updateAdminCourse(int cno, int tno, int oldtno){
        return adminCourseMapper.updateAdminCourse(cno, tno, oldtno);
    }

    public int deleteAdminCourse(int cno, int tno){
        return adminCourseMapper.deleteAdminCourse(cno, tno);
    }

}
