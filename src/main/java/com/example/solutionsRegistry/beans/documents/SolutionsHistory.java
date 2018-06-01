package com.example.solutionsRegistry.beans.documents;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SolutionsHistory {
    @Id
    public ObjectId id;
    @NotNull
    private Method method;
    @NotNull
    private List<Reagent> reagentsList;
    @NotNull
    private Solution solution;
    @NotNull
    private Date solutionCreationDate;

    public SolutionsHistory() {
    }

    public SolutionsHistory(ObjectId id, @NotNull Method method, @NotNull List<Reagent> reagentsList, @NotNull Date solutionCreationDate, @NotNull Solution solution) {
        setId(id);
        setMethod(method);
        setSolution(solution);
        setSolutionCreationDate(solutionCreationDate);
        setReagentsList(new ArrayList<>());
        for (Reagent reagent : reagentsList) {
            reagentsList.add(reagent);
        }
    }


//

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public List<Reagent> getReagentsList() {
        return reagentsList;
    }

    public void setReagentsList(List<Reagent> reagentsList) {
        this.reagentsList = reagentsList;
    }

    public Solution getSolution() {
        return solution;
    }

    public void setSolution(Solution solution) {
        this.solution = solution;
    }

    public Date getSolutionCreationDate() {
        return solutionCreationDate;
    }

    public void setSolutionCreationDate(Date solutionCreationDate) {
        this.solutionCreationDate = solutionCreationDate;
    }
}
