package com.example.demo.service;

import com.example.demo.bean.Account;
import com.example.demo.mapper.AccountMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;
@Slf4j
@Service
public class AccountService {
    @Autowired
    AccountMapper accountMapper;

    public Account getAcctByid(Long id) {
        return accountMapper.getAcct(id);
    }
}
