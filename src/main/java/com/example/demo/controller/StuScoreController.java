package com.example.demo.controller;

import com.example.demo.bean.Score;
import com.example.demo.bean.StuScore;
import com.example.demo.service.ScoreService;
import com.example.demo.service.StuScoreService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Controller
@CrossOrigin //跨域问题
public class StuScoreController {
    @Autowired
    JdbcTemplate jdbctemplate;

    @Autowired
    StuScoreService stuScoreService;

    @ResponseBody
    @GetMapping("/getstuscore")
    public List<StuScore> getStuScore(@RequestParam("cno") String cno, @RequestParam("sno") String sno, @RequestParam("term") String term){
        Map<String, String> termMap = new HashMap<String, String>();
        termMap.put("1up","大一上");
        termMap.put("1down","大一下");
        termMap.put("2up","大二上");
        termMap.put("2down","大二下");
        termMap.put("3up","大三上");
        termMap.put("3down","大三下");
        if (!cno.equals(""))
            return stuScoreService.getStuScore(Integer.valueOf(cno), Integer.valueOf(sno), termMap.get(term));
        else
            return stuScoreService.getStuScore(-1, Integer.valueOf(sno), termMap.get(term));
    }
}
