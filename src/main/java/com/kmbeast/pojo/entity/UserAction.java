package com.kmbeast.pojo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.time.LocalDateTime;


//用户行为操作实体
@TableName(value = "notice")
@Data
public class UserAction {

    //    主键
    @TableId(type = IdType.AUTO)
    private Integer id;
    //    用户id，关联的是用户表
    private Integer userId;
    //    书目id，外键，关联的书目信息表
    private Integer booklistId;
    //    类型（1-收藏 2-点击 3-想看 4-停留时长）
    private Integer type;
    //    停留时间（只有当行为操作类型是'停留'时才需要设置）
    private long stayTime;
    //    创建时间
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
}
