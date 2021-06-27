package com.example.demo.controller;

import com.example.demo.bean.Course;
import com.example.demo.bean.Student;
import com.example.demo.service.CourseService;
import com.example.demo.service.StuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Slf4j
@Controller
@CrossOrigin //跨域问题
public class CourseController {
    @Autowired
    JdbcTemplate jdbctemplate;

    @Autowired
    CourseService courseService;

    @ResponseBody
    @GetMapping("/courseinfo")
    public List<Course> getStuInfo(@RequestParam("id") String id){
        return courseService.getCourseInfo(Integer.valueOf(id));
    }
}
