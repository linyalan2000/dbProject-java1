package com.example.demo.mapper;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PassMapper {
    String getPass(String id);
}
