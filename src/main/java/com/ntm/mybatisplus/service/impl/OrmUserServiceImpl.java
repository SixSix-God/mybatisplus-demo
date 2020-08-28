package com.ntm.mybatisplus.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ntm.mybatisplus.service.OrmUserService;
import com.ntm.mybatisplus.dao.OrmUserMapper;

/***
 *@author Created by Mybatis Generator on 2020/08/28
 */
@Service
public class OrmUserServiceImpl implements OrmUserService {

    @Autowired
    private OrmUserMapper ormUserMapper;

}