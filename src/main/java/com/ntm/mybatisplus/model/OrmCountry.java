package com.ntm.mybatisplus.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

/***
 * @author  Created by Mybatis Generator on 2020/08/28
 */
@ApiModel(value="com.ntm.mybatisplus.model.OrmCountry")
@Data
public class OrmCountry implements Serializable {
    /**
     * 
     */
    @ApiModelProperty(value="id")
    private Integer id;

    /**
     * 
     */
    @ApiModelProperty(value="country")
    private String country;

    /**
     * 
     */
    @ApiModelProperty(value="people")
    private String people;

    private static final long serialVersionUID = 1L;
}