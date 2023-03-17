package com.imviet.web_shop.services.impl;

import com.imviet.web_shop.models.category;
import com.imviet.web_shop.repositories.ICategoryRepository;
import com.imviet.web_shop.repositories.impl.CategoryRepository;
import com.imviet.web_shop.services.ICategoryService;
import jakarta.inject.Inject;

import java.util.List;

public class CategoryService implements ICategoryService {

    private ICategoryRepository _categoryRepository;

    public CategoryService() {
        this._categoryRepository = new CategoryRepository();
    }

    @Override
    public List<category> getAllCategories() {
        return _categoryRepository.getAll();
    }

    @Override
    public category addNewCategory(category cate) {
        return _categoryRepository.save(cate);
    }

    @Override
    public category findCategoryById(Long id) {
        return _categoryRepository.findById(id);
    }

    @Override
    public void updateCategory(category cate) {
        _categoryRepository.update(cate);
    }

    @Override
    public void deleteCategory(category cate) {
        _categoryRepository.delete(cate);
    }
}
