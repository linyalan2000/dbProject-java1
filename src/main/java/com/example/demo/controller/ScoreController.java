package com.example.demo.controller;


import com.example.demo.bean.Score;

import com.example.demo.service.ScoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Controller
@CrossOrigin //跨域问题
public class ScoreController {
    @Autowired
    JdbcTemplate jdbctemplate;

    @Autowired
    ScoreService scoreService;

    @ResponseBody
    @GetMapping("/getscore")
    public List<Score> getScore(@RequestParam("cno") String cno, @RequestParam("tno") String tno){
        return scoreService.getScore(Integer.valueOf(cno), Integer.valueOf(tno));
    }

    @ResponseBody
    @PostMapping("/updatescore")
    public int updateScore(RequestEntity requestEntity) {
        LinkedHashMap<String, String> msg = (LinkedHashMap<String, String>) requestEntity.getBody();
        int cno = Integer.valueOf(msg.get("cno"));
        int sno = Integer.valueOf(msg.get("sno"));
        int score = Integer.valueOf(msg.get("score"));
        return scoreService.updateScore(cno, sno, score);
    }
}
