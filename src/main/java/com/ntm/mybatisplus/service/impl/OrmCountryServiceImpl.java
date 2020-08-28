package com.ntm.mybatisplus.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntm.mybatisplus.service.OrmCountryService;
import com.ntm.mybatisplus.dao.OrmCountryMapper;

/***
 *@author Created by Mybatis Generator on 2020/08/28
 */
@Service
public class OrmCountryServiceImpl implements OrmCountryService {

    @Autowired
    private OrmCountryMapper ormCountryMapper;

}