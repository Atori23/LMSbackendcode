package com.kmbeast.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kmbeast.mapper.CategoryMapper;
import com.kmbeast.pojo.dto.CategoryQueryDTO;
import com.kmbeast.pojo.entity.Category;
import com.kmbeast.pojo.vo.CategoryVO;
import com.kmbeast.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 图书类别业务逻辑接口实现类
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {


    @Override
    public void addCategory(Category category) {

    }

    @Override
    public void updateCategory(Category category) {

    }

    @Override
    public void delCategory(Integer id) {

    }

    @Override
    public List<CategoryVO> queryPage(CategoryQueryDTO categoryQueryDTO) {
        return List.of();
    }

    @Override
    public Integer queryPageCount(CategoryQueryDTO categoryQueryDTO) {
        return 0;
    }

}