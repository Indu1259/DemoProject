package com.indhu.restapi.controllers.v1;

import com.indhu.restapi.api.v1.model.CategoryDTO;
import com.indhu.restapi.api.v1.model.CategoryListDTO;
import com.indhu.restapi.exceptions.ResourceNotFoundException;
import com.indhu.restapi.services.CategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@Api(description = "Supports GET operation", tags = {"categories"})
@RestController
@RequestMapping(CategoryController.BASE_URL)
public class CategoryController {

    public static final String BASE_URL = "/api/v1/categories";

    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @ApiOperation(value = "Lists all the product categories", notes = "")
    @GetMapping(value = {"/"}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public CategoryListDTO getCategories() {

        return new CategoryListDTO(categoryService.getCategories());

    }


    @ApiOperation(value = "Get a category by category name", notes = "", response = CategoryDTO.class)
    @GetMapping(value = {"/{categoryName}"}, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public CategoryDTO getCategoryByName(@PathVariable String categoryName) {

        CategoryDTO categoryDTO = categoryService.findByCategoryName(categoryName);

        if(categoryDTO == null) {
            throw new ResourceNotFoundException();
        }

        return categoryDTO;
    }

}
