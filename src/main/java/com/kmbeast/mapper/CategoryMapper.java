package com.kmbeast.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kmbeast.pojo.entity.Category;
import org.apache.ibatis.annotations.Mapper;

//图书类别的持久化接口
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}
