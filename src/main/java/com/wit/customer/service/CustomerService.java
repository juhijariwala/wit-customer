package com.wit.customer.service;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private SqlSession sqlSession;


    @Override
    public String toString() {
        return "Testing customer called!";
    }
}
