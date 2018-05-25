package com.example.solutionsRegistry.repositories;

import com.example.solutionsRegistry.beans.documents.SolutionsHistory;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LogRepository extends CrudRepository<SolutionsHistory, String> {
    List<SolutionsHistory> findAll();

    SolutionsHistory findSolutionEntryById(String id);

}
