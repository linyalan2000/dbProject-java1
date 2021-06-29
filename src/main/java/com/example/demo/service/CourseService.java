package com.example.demo.service;

import com.example.demo.bean.Course;
import com.example.demo.bean.Teacher;
import com.example.demo.mapper.CourseMapper;
import com.example.demo.mapper.TeaMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CourseService {
    @Autowired
    CourseMapper courseMapper;

    public List<Course> getCourseInfo(int id, int cno) {
        return courseMapper.getCourseInfo(id, cno);
    }

}
