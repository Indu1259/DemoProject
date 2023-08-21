package com.indhu.restapi.api.v1.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@ApiModel(value = "Category", description = "category")
@Data
public class CategoryDTO {

    @ApiModelProperty(value = "Category Name", required = true)
    @NotNull(message = "NotNull.categoryDTO.description")
    @Size(min = 1, max = 255)
    private String categoryName;

}
