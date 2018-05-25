package com.example.solutionsRegistry.repositories;

import com.example.solutionsRegistry.beans.documents.Method;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MethodRepository extends CrudRepository<Method, String> {
    List<Method> findAll();

}
