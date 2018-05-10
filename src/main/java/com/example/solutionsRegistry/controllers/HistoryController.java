package com.example.solutionsRegistry.controllers;

import com.example.solutionsRegistry.beans.SolutionsHistory;
import com.example.solutionsRegistry.services.LoggingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/")
public class HistoryController {

    @Autowired
    private LoggingService loggingService;

    //POST
    @RequestMapping(value = "/createentry", method = RequestMethod.POST)
    public SolutionsHistory createNewEntry(@Valid @RequestBody SolutionsHistory solutionsHistory) {
        return loggingService.createNewEntry(solutionsHistory);
    }

    //GET
    @RequestMapping(value = "/getentries", method = RequestMethod.GET)
    public List<SolutionsHistory> findAll() {
        return loggingService.findAll();
    }

    //GET
    @RequestMapping(value = "/getentrybyid/{id}", method = RequestMethod.GET)
    public SolutionsHistory findSolutionENtryById(@PathVariable("id") String id) {
        return loggingService.findSolutionEntryById(id);
    }

    //PUT
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public SolutionsHistory updateEntry(@PathVariable("id") String id, @Valid @RequestBody SolutionsHistory solutionsHistory) {
        return loggingService.updateEntry(id, solutionsHistory);
    }

    //DELETE
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public String deleteEntry(@PathVariable("id") String id) {
        loggingService.deleteEntry(id);

        return "{\n\"status\": \"OK\"\n}";
    }
}
