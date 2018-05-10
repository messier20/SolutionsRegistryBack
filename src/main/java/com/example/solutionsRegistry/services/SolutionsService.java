package com.example.solutionsRegistry.services;

import com.example.solutionsRegistry.beans.*;
import com.example.solutionsRegistry.repositories.*;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class SolutionsService {

    @Autowired
    MethodRepository methodRepository;
    @Autowired
    ReagentRepository reagentRepository;
    @Autowired
    SolutionRepository solutionRepository;
    @Autowired
    SolutionWithReagentsRepository solutionWithReagentsRepository;
    @Autowired
    FullMethodRepository fullMethodRepository;


    public FullMethod findMethodById2(String methodId) {
        Optional<Method> fullMethodById = methodRepository.findById(methodId);
        System.out.println("method " + fullMethodById);


        List<SolutionWithReagents> allCurrentSolutionsWIthReagents;
        List<SolutionWithReagents> solutionsWithReagents = getAllSolutionsWithReagents();

        allCurrentSolutionsWIthReagents = new ArrayList<>();
        for (SolutionWithReagents solutionWithReagents : solutionsWithReagents) {
            if (fullMethodById.get().getMethodId().equals(solutionWithReagents.getSolution().getMethodId())) {
                allCurrentSolutionsWIthReagents.add(solutionWithReagents);
                System.out.println("solutionWithReagents " + solutionWithReagents.getSolution().getMethodId() + " " + fullMethodById.get().getMethodId());
            }
        }
        FullMethod fullMethod = new FullMethod(fullMethodById.get(), allCurrentSolutionsWIthReagents);


        return fullMethod;
    }

    public List<SolutionWithReagents> getAllSolutionsWithReagents() {
        List<SolutionWithReagents> allSolutionsWithReagents = new ArrayList<>();
        List<Reagent> allCurrentReagents;
        List<Reagent> reagents = reagentRepository.findAll();
        List<Solution> solutions = solutionRepository.findAll();

        for (Solution solution : solutions) {
            allCurrentReagents = new ArrayList<>();
            for (Reagent reagent : reagents) {
                if (solution.getSolutionId().equals(reagent.getSolutionId())) {
                    allCurrentReagents.add(reagent);
                }
            }
            allSolutionsWithReagents.add(new SolutionWithReagents(solution, allCurrentReagents));
        }
        return allSolutionsWithReagents;
    }


    public List<FullMethod> getAllFullMethods() {
        List<FullMethod> allFulMethods = new ArrayList<>();
        List<SolutionWithReagents> allCurrentSolutionsWIthReagents;
        List<SolutionWithReagents> solutionsWithReagents = getAllSolutionsWithReagents();
        List<Method> methods = methodRepository.findAll();

        for (Method method : methods) {
            allCurrentSolutionsWIthReagents = new ArrayList<>();
            for (SolutionWithReagents solutionWithReagents : solutionsWithReagents) {
                if (method.methodId.equals(solutionWithReagents.getSolution().getMethodId())) {
                    allCurrentSolutionsWIthReagents.add(solutionWithReagents);
                    System.out.println("solutionWithReagents " + solutionWithReagents.getSolution().getMethodId() + " " + method.getMethodId());
                }
            }
            allFulMethods.add(new FullMethod(method, allCurrentSolutionsWIthReagents));

        }
        return allFulMethods;
    }


    public void initializeSol() {
        ObjectId methodId;
        methodId = new ObjectId();

        methodRepository.save(new Method(methodId, "LST EN ISO 7887:2012 en. Spalvos nustatymas"));

        ObjectId solutionId;
        solutionId = new ObjectId();
        solutionRepository.save(new Solution(solutionId, 2.1, "Pradinis spalvos kalibracinės kreivės tirpalas 500 mg/l Pt", "3 metai (4+-2)oC", methodId));
        ObjectId reagentId;
        reagentId = new ObjectId();
        reagentRepository.save(new Reagent(reagentId, "15", "0,3113 g", "Kalio heksachlorplatinatas", " ", solutionId));
        reagentId = new ObjectId();
        reagentRepository.save(new Reagent(reagentId, "21", "0,25 g", "Kobalto chloridas", "2017-10", solutionId));
        reagentId = new ObjectId();
        reagentRepository.save(new Reagent(reagentId, "12", "25 ml", "Koncentruota hipochloritinė rūhštis", "2018-08", solutionId));
        reagentId = new ObjectId();
        reagentRepository.save(new Reagent(reagentId, " ", "iki 250 ml", "Optiškai skaidrus vanduo", " ", solutionId));

        solutionId = new ObjectId();
        solutionRepository.save(new Solution(solutionId, 2.2, "Darbinis splavos kalibracinės kreivės tirpalas 100 mg/l Pt", "1 mėnuo (4+-2)oC", methodId));
        reagentId = new ObjectId();
        reagentRepository.save(new Reagent(reagentId, "2.1", "20 ml", "Pradinis spalvos kalibracinės kreivės tirpalas 500 mg/l Pt", " ", solutionId));
        reagentId = new ObjectId();
        reagentRepository.save(new Reagent(reagentId, " ", "iki 100 ml", "Optiškai skaidrus vanduo", " ", solutionId));
        solutionId = new ObjectId();
        solutionRepository.save(new Solution(solutionId, 2.3, "Spalvos savikontrolinis tirpalas 3000 mg/l Pt", "3 mėn. (4± 2)°C", methodId));
        reagentId = new ObjectId();
        reagentRepository.save(new Reagent(reagentId, "13", "0,092 g", "Humuso rūgštis", " ", solutionId));
        reagentId = new ObjectId();
        reagentRepository.save(new Reagent(reagentId, "40", "4,2 g", "Natrio vandenilio karbonatas", "2018-03", solutionId));
        reagentId = new ObjectId();
        reagentRepository.save(new Reagent(reagentId, " ", "iki 500 ml", "Dejonizuotas vanduo", " ", solutionId));

        solutionId = new ObjectId();
        solutionRepository.save(new Solution(solutionId, 2.4, "Spalvos savikontrolinis darbinis tirpalas 30 Mg/l Pt", "pagaminimo dieną", methodId));




    }

}
