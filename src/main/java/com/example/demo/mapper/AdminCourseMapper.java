package com.example.demo.mapper;


import com.example.demo.bean.AdminCourse;
import com.example.demo.bean.AdminScore;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminCourseMapper {
    List<AdminCourse> getAdminCourse(int cno, int tno);
//    int updateAdminScore(int cno, int sno, int score);
//    int deleteAdminScore(int cno, int sno);
}
