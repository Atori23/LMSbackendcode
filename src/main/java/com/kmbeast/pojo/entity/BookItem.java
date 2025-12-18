package com.kmbeast.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

//mybatis plus + mybatis (混合开发)

//馆藏书目的实体
@TableName(value = "book_item")
@Data
public class BookItem {

//    主键ID
    @TableId(type = IdType.AUTO)
    private Integer id;
//    书目ID，外键，关联的是书目信息表的ID
    private Integer booklistId;
//    馆藏位置
    private String location;
//    备注
    private String record;
//    购买书籍的价格
    private BigDecimal buyPrice;
//    购买日期
    private LocalDate buyDate;
//    状态（1-在馆 2-借出 3-损毁 4-丢失）
    private Integer status;
}
