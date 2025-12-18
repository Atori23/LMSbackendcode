package com.kmbeast.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

//mybatis plus + mybatis (混合开发)

//书籍类别关联表实体
@TableName(value = "book_category")
@Data
public class BookCategory {

//    主键ID
    @TableId(type = IdType.AUTO)
    private Integer id;
//    书目ID，外键，关联的是书目信息表的ID
    private Integer booklistId;
//    图书类别ID，外键，关联的是图书类别信息表的ID
    private Integer categroyId;
}
