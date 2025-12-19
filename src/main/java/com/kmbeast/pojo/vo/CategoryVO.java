package com.kmbeast.pojo.vo;

import com.kmbeast.pojo.entity.Category;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

//图书类别VO类
@EqualsAndHashCode(callSuper = true)
@Data
public class CategoryVO extends Category {
//    其下是否有子类别标识
    private boolean hasChildren;
//    子类别集合
    private List<CategoryVO> children;
}
