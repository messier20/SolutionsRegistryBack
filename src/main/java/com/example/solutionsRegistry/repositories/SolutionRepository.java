package com.example.solutionsRegistry.repositories;

import com.example.solutionsRegistry.beans.Solution;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface SolutionRepository extends CrudRepository<Solution, String> {
    List<Solution> findAll();
}
