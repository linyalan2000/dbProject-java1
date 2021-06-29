package com.example.demo.controller;


import com.example.demo.bean.AdminScore;
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
public class AdminScoreController {
    @Autowired
    JdbcTemplate jdbctemplate;

    @Autowired
    AdminScoreService adminScoreService;

    @ResponseBody
    @GetMapping("/getadminscore")
    public List<AdminScore> getAdminScore(@RequestParam("cno") String cno, @RequestParam("sno") String sno){
        int a, b;
        if (cno != "")
            a = Integer.valueOf(cno);
        else
            a = -1;
        if (sno != "")
            b = Integer.valueOf(sno);
        else
            b = -1;
        return adminScoreService.getAdminScore(a, b);
    }

    @ResponseBody
    @PostMapping("/updateadminscore")
    public int updateAdminScore(RequestEntity requestEntity) {
        LinkedHashMap<String, String> msg = (LinkedHashMap<String, String>) requestEntity.getBody();
        int cno = Integer.valueOf(msg.get("cno"));
        int sno = Integer.valueOf(msg.get("sno"));
        int score = Integer.valueOf(msg.get("score"));
        return adminScoreService.updateAdminScore(cno, sno, score);
    }

    @ResponseBody
    @PostMapping("/deleteadminscore")
    public int deleteAdminScore(RequestEntity requestEntity) {
        LinkedHashMap<String, String> msg = (LinkedHashMap<String, String>) requestEntity.getBody();
        int cno, sno;
        if (msg.get("cno") != "")
            cno = Integer.valueOf(msg.get("cno"));
        else
            cno = -1;
        if (msg.get("sno") != "")
            sno = Integer.valueOf(msg.get("sno"));
        else
            sno = -1;
        return adminScoreService.deleteAdminScore(cno, sno);
    }

    @ResponseBody
    @PostMapping("/addadminscore")
    public int addAdminScore(RequestEntity requestEntity) {
        LinkedHashMap<String, String> msg = (LinkedHashMap<String, String>) requestEntity.getBody();
        int cno = Integer.valueOf(msg.get("cno"));
        int sno = Integer.valueOf(msg.get("sno"));
        int tno = Integer.valueOf(msg.get("tno"));
        return adminScoreService.addAdminScore(sno, cno, tno);
    }
}
