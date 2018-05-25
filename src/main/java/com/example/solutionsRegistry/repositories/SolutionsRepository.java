package com.example.solutionsRegistry.repositories;

import com.example.solutionsRegistry.beans.documents.Solution;
import org.springframework.data.repository.CrudRepository;

public interface SolutionsRepository extends CrudRepository<Solution, String> {
//    List<Solution> findAll();
//
//    List<Solution> findSolutionById(String solutionId);
}
