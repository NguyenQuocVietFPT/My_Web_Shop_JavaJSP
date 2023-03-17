package com.imviet.web_shop.repositories;

import com.imviet.web_shop.models.category;

import java.util.List;

public interface ICategoryRepository {

    List<category> getAll();

    category save(category cate);

    category findById(Long id);

    List<category> search(String keyWord, String value);

    boolean checkExist(String cate_code);

    void update(category cate);

    void delete(category cate);
}
