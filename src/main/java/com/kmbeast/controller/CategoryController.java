package com.kmbeast.controller;

import com.kmbeast.pojo.api.Result;
import com.kmbeast.pojo.dto.CategoryQueryDTO;
import com.kmbeast.pojo.entity.Category;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// 图书类别控制器（Category Controller）
@RestController
@RequestMapping("/category")
public class CategoryController {
//    增删改查

//    图书类别新增
//    POST /api/v1.0/book-manage-api/Category
//    @param category 图书类别实体
//    @return Result<Void> 后台通用返回封装类
    @PostMapping
    public Result<Void> addCategory(@RequestBody Category category) {

    }

//    图书类别修改
//    POST /api/v1.0/book-manage-api/Category/update (这是他的一个接口路径)
//    @param category 图书类别实体
//    @return Result<Void> 后台通用返回封装类
    @PostMapping("/update")
    public Result<Void> updateCategory(@RequestBody Category category) {

    }

//    图书类别删除（通过传进来的id删除）
//    DELETE /api/v1.0/book-manage-api/Category/{id} (这是他的一个接口路径)
//    @param id 图书类别主键id
//    @return Result<Void> 后台通用返回封装类
    @DeleteMapping("/{id}")
    public Result<Void> deleteCategory(@PathVariable Integer id) {

    }

//    图书类别查询
//    POST /api/v1.0/book-manage-api/Category/query
//    @param CategoryQueryDTO 查询条件类
//    @return Result<List<CategoryVO>> 后台通用返回封装类
    @PostMapping("/query")
    public Result<List<CategoryVO>> queryPage(@RequestBody CategoryQueryDTO categoryQueryDTO) {
        List<CategoryVO>

    }
}
