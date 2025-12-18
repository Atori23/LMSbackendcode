package com.kmbeast.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

//mybatis plus + mybatis (混合开发)

//图书类别实体
@TableName(value = "category")
@Data
public class Category {

//    主键
    @TableId(type = IdType.AUTO)
    private Integer id;
//    名称
    private String name;
//    层级
    private Integer level;
//    父级类ID
    private Integer parentId;
}
