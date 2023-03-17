package com.imviet.web_shop.services;

import com.imviet.web_shop.models.category;

import java.util.List;

public interface ICategoryService {

    List<category> getAllCategories();

    category addNewCategory(category cate);

    category findCategoryById(Long id);

    void updateCategory(category cate);

    void deleteCategory(category cate);
}
