package com.imviet.web_shop.tests;

import com.imviet.web_shop.services.ICategoryService;
import com.imviet.web_shop.services.impl.CategoryService;

public class CategoryTest {

    public static void main(String[] args) {

        ICategoryService _categoryService = new CategoryService();
        System.out.println(_categoryService.getAllCategories());
    }
}
