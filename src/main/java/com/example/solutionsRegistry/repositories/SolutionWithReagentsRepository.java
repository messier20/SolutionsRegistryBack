package com.example.solutionsRegistry.repositories;

import com.example.solutionsRegistry.beans.documents.SolutionWithReagents;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SolutionWithReagentsRepository extends CrudRepository<SolutionWithReagents, String> {
    List<SolutionWithReagents> findAll();
}
