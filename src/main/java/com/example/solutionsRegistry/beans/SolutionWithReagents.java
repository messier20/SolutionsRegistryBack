package com.example.solutionsRegistry.beans;

import java.util.ArrayList;
import java.util.List;

public class SolutionWithReagents {
    private Solution solution;
    List<Reagent> reagentsList;

    public SolutionWithReagents(Solution solution, List<Reagent> reagents) {
        setReagentsList(new ArrayList<>());
        setSolution(solution);
        for (Reagent reagent : reagents) {
            reagentsList.add(reagent);
        }
    }

    public Solution getSolution() {
        return solution;
    }

    public void setSolution(Solution solution) {
        this.solution = solution;
    }

    public List<Reagent> getReagentsList() {
        return reagentsList;
    }

    public void setReagentsList(List<Reagent> reagentsList) {
        this.reagentsList = reagentsList;
    }
}
