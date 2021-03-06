package com.example.solutionsRegistry.controllers;

import com.example.solutionsRegistry.beans.documents.FullMethod;
import com.example.solutionsRegistry.beans.documents.Method;
import com.example.solutionsRegistry.beans.documents.SolutionWithReagents;
import com.example.solutionsRegistry.beans.response.FullMethodsResponse;
import com.example.solutionsRegistry.beans.response.MethodsResponse;
import com.example.solutionsRegistry.services.SolutionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/")
public class SolutionsController {

    @Autowired
    private SolutionsService solutionsService;


    //    GET
    @RequestMapping(value = "/fullmethod/{id}", method = RequestMethod.GET)
    public FullMethodsResponse getFullMethodById(@PathVariable("id") String id) {
        return solutionsService.findMethodById2(id);
    }

    //    GET
    @RequestMapping(value = "/fullmethods", method = RequestMethod.GET)
    public List<FullMethod> getAllFullMethods() {
        return solutionsService.getAllFullMethods();
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public List<SolutionWithReagents> getAllSolutionsWithReagents() {
        return solutionsService.getAllSolutionsWithReagents();
    }
    // GET
    @RequestMapping(value = "/getMethods", method = RequestMethod.GET)
    public List<MethodsResponse> getAllMethods(){
        return solutionsService.getAllMethods();
    }

    //POST
    @RequestMapping(value = "/initsolutions", method = RequestMethod.POST)
    public String initDBWithSolutions() {
        solutionsService.initializeSol();

        return "{\n\"status\": \"OK\"\n}";
    }


}
