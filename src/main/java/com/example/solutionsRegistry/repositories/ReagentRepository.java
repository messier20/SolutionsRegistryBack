package com.example.solutionsRegistry.repositories;

import com.example.solutionsRegistry.beans.documents.Reagent;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReagentRepository extends CrudRepository<Reagent, String> {
    List<Reagent> findAll();
}
