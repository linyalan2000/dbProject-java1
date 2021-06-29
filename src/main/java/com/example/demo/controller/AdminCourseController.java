package com.example.demo.controller;


import com.example.demo.bean.AdminCourse;
import com.example.demo.bean.AdminScore;
import com.example.demo.service.AdminCourseService;
import com.example.demo.service.AdminScoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;

@Slf4j
@Controller
@CrossOrigin //跨域问题
public class AdminCourseController {
    @Autowired
    JdbcTemplate jdbctemplate;

    @Autowired
    AdminCourseService adminCourseService;

    @ResponseBody
    @GetMapping("/getadmincourse")
    public List<AdminCourse> getAdminCourse (@RequestParam("cno") String cno, @RequestParam("tno") String tno){
        int a, b;
        if (cno != "")
            a = Integer.valueOf(cno);
        else
            a = -1;
        if (tno != "")
            b = Integer.valueOf(tno);
        else
            b = -1;
        return adminCourseService.getAdminCourse(a, b);
    }

    @ResponseBody
    @PostMapping("/updateadmincourse")
    public int updateAdminScore(RequestEntity requestEntity) {
        LinkedHashMap<String, String> msg = (LinkedHashMap<String, String>) requestEntity.getBody();
        int cno = Integer.valueOf(msg.get("cno"));
        int tno = Integer.valueOf(msg.get("tno"));
        int oldtno = Integer.valueOf(msg.get("oldtno"));
        return adminCourseService.updateAdminCourse(cno,tno, oldtno);
    }

    @ResponseBody
    @PostMapping("/addadmincourse")
    public int addAdminScore(RequestEntity requestEntity) {
        LinkedHashMap<String, String> msg = (LinkedHashMap<String, String>) requestEntity.getBody();
        int cno = Integer.valueOf(msg.get("cno"));
        int tno = Integer.valueOf(msg.get("tno"));
        String cname = msg.get("cname");
        String acedamy = msg.get("acedamy");
        String term = msg.get("term");
        String credit = msg.get("credit");
        return adminCourseService.insertAdminCourse(cno, tno, cname, acedamy, term, credit);
    }

    @ResponseBody
    @PostMapping("/deleteadmincourse")
    public int deleteAdminScore(RequestEntity requestEntity) {
        LinkedHashMap<String, String> msg = (LinkedHashMap<String, String>) requestEntity.getBody();
        int cno = Integer.valueOf(msg.get("cno"));
        int tno = Integer.valueOf(msg.get("tno"));
        return adminCourseService.deleteAdminCourse(cno, tno);
    }
}
