package com.ntm.mybatisplus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ntm.mybatisplus.service.OrmCountryService;

/***
 *@author Created by Mybatis Generator on 2020/08/28
 */
@RestController
@RequestMapping("/ormCountry")
public class OrmCountryController {

    @Autowired
    private OrmCountryService ormCountryService;

}