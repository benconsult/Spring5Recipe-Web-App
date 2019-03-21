package com.springprojects.spring5recipewebapp.repositories;

import com.springprojects.spring5recipewebapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
