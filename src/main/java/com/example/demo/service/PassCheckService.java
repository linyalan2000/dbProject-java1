package com.example.demo.service;

import com.example.demo.bean.Person;
import com.example.demo.mapper.StuPassCheckMapper;
import com.example.demo.mapper.TeaPassCheckMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PassCheckService {
    @Autowired
    TeaPassCheckMapper teaPassCheckMapper;
    @Autowired
    StuPassCheckMapper stuPassCheckMapper;

    Person faultPer = new Person();
    Person person;
    public Person getPass(int id, String pass, String p) {
        if (p.equals("1")){
            if (teaPassCheckMapper.getTeaPass(id) != null) {
                person = teaPassCheckMapper.getTeaPass(id);
                log.info(person.getName());

                if (person.getPass().equals(pass)) {
                    return person;
                }
            }
        }
        else if (p.equals("2")){
            if (stuPassCheckMapper.getStuPass(id) != null) {
                person = stuPassCheckMapper.getStuPass(id);
                if (person.getPass().equals(pass)) {
                    return person;
                }
            }
        }
        return faultPer;
    }
    public int editPass(int id, String pass, String p) {
        if (p.equals("t") || p.equals("a")){
            return teaPassCheckMapper.editTeaPass(id, pass);
        }
        else if (p.equals("s")){
            return stuPassCheckMapper.editStuPass(id, pass);
        }
        return 0;
    }

    public int editTel(int id, String tel, String p) {
        return teaPassCheckMapper.editTeaTel(id, tel);
    }
}
