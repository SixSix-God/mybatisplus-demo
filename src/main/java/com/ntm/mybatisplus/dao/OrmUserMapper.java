package com.ntm.mybatisplus.dao;

import com.ntm.mybatisplus.model.OrmUser;

/**
 * @author  Created by Mybatis Generator on 2020/08/28
 */
public interface OrmUserMapper {
    /**
     * 根据主键删除
     * @param id
     * @return int
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 新增
     * @param record
     * @return int
     */
    int insert(OrmUser record);

    /**
     * 选择性新增
     * @param record
     * @return int
     */
    int insertSelective(OrmUser record);

    /**
     * 根据主键查询
     * @param id
     * @return OrmUser
     */
    OrmUser selectByPrimaryKey(Integer id);

    /**
     * 根据主键选择更新
     * @param record
     * @return int
     */
    int updateByPrimaryKeySelective(OrmUser record);

    /**
     * 根据主键更新
     * @param record
     * @return int
     */
    int updateByPrimaryKey(OrmUser record);
}