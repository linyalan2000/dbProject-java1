package com.example.demo.mapper;


import com.example.demo.bean.AdminCourse;
import com.example.demo.bean.AdminScore;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminCourseMapper {
    List<AdminCourse> getAdminCourse(int cno, int tno);
    int updateAdminCourse(int cno, int tno, int oldtno);
    int AddAdminCourse(int cno, int tno, String cname, String acedamy, String term, String credit);
    int deleteAdminCourse(int cno, int tno);
}
