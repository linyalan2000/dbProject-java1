package com.example.demo.mapper;


import com.example.demo.bean.Score;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CreditMapper {
    int getCredit(int sno);
}
