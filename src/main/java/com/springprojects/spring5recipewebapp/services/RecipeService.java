package com.springprojects.spring5recipewebapp.services;

import com.springprojects.spring5recipewebapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
}
