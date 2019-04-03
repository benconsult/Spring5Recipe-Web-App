package com.springprojects.spring5recipewebapp.services;

import com.springprojects.spring5recipewebapp.commands.RecipeCommand;
import com.springprojects.spring5recipewebapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
    Recipe findById(Long l);
    RecipeCommand saveRecipeCommand(RecipeCommand command);
    RecipeCommand findCommandById(Long l);
    void deleteById(Long idToDelete);
}
