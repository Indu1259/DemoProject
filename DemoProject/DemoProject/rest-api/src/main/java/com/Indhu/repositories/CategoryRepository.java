package com.indhu.restapi.repositories;

import com.indhu.restapi.domain.Category;
import io.swagger.annotations.Api;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@Api(tags = "Category Entity")
public interface CategoryRepository extends JpaRepository<Category, Long> {


    Category findByCategoryName(String categoryName);
}
