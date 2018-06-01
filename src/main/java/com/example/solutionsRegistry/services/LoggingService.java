package com.example.solutionsRegistry.services;


import com.example.solutionsRegistry.beans.documents.SolutionsHistory;
import com.example.solutionsRegistry.repositories.LogRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;

@Service
public class LoggingService {

    @Autowired
    LogRepository logRepository;

    public SolutionsHistory createNewEntry(@Valid SolutionsHistory solutionsHistory) {
        SolutionsHistory newsolutionsHistory = new SolutionsHistory();
        newsolutionsHistory.setId(new ObjectId());
        newsolutionsHistory.setMethod(solutionsHistory.getMethod());
        newsolutionsHistory.setSolution(solutionsHistory.getSolution());
        newsolutionsHistory.setReagentsList(solutionsHistory.getReagentsList());
//        newsolutionsHistory.setSolutionsWithReagentsList(solutionsHistory.getSolutionsWithReagentsList());
        newsolutionsHistory.setSolutionCreationDate(solutionsHistory.getSolutionCreationDate());

        return logRepository.save(newsolutionsHistory);
    }

    public List<SolutionsHistory> findAll() {
        return logRepository.findAll();
    }

    public SolutionsHistory findSolutionEntryById(String id) {
        return logRepository.findSolutionEntryById(id);
    }


//    TODO: fix
    public SolutionsHistory updateEntry(String id, SolutionsHistory updateSolutionsHistory) {
        SolutionsHistory solutionsHistory = logRepository.findSolutionEntryById(id);
        solutionsHistory.setMethod(updateSolutionsHistory.getMethod());
//        solutionsHistory.setSolutionsWithReagentsList(updateSolutionsHistory.getSolutionsWithReagentsList());
        return logRepository.save(solutionsHistory);
    }

    public void deleteEntry(String id) {
        logRepository.delete(logRepository.findSolutionEntryById(id));
    }
}
