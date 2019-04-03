package com.springprojects.spring5recipewebapp.services;

import com.springprojects.spring5recipewebapp.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
