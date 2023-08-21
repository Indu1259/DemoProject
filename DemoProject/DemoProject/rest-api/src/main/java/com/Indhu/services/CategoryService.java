package com.indhu.restapi.services;

import com.indhu.restapi.api.v1.model.CategoryDTO;
import com.indhu.restapi.domain.Category;

import java.util.List;

/**
 * Category Interface
 */
public interface CategoryService {

    List<CategoryDTO> getCategories();
    CategoryDTO findByCategoryName(String categoryName);
}
