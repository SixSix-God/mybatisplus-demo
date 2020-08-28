package com.ntm.mybatisplus.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/***
 * @author  Created by Mybatis Generator on 2020/08/28
 */
@ApiModel(value="com.ntm.mybatisplus.model.OrmUser")
@Data
public class OrmUser implements Serializable {
    /**
     * 主键
     */
    @ApiModelProperty(value="主键")
    private Integer id;

    /**
     * 用户名
     */
    @ApiModelProperty(value="用户名")
    private String name;

    /**
     * 加密后的密码
     */
    @ApiModelProperty(value="加密后的密码")
    private String password;

    /**
     * 加密使用的盐
     */
    @ApiModelProperty(value="加密使用的盐")
    private String salt;

    /**
     * 邮箱
     */
    @ApiModelProperty(value="邮箱")
    private String email;

    /**
     * 手机号码
     */
    @ApiModelProperty(value="手机号码")
    private String phoneNumber;

    /**
     * 状态，-1：逻辑删除，0：禁用，1：启用
     */
    @ApiModelProperty(value="状态，-1：逻辑删除，0：禁用，1：启用")
    private Integer status;

    /**
     * 创建时间
     */
    @ApiModelProperty(value="创建时间")
    private Date createTime;

    /**
     * 上次登录时间
     */
    @ApiModelProperty(value="上次登录时间")
    private Date lastLoginTime;

    /**
     * 上次更新时间
     */
    @ApiModelProperty(value="上次更新时间")
    private Date lastUpdateTime;

    private static final long serialVersionUID = 1L;
}