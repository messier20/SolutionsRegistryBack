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
    private List<SolutionWithReagents> solutionsWithReagentsList;
    @NotNull
    private Date solutionCreationDate;

    public SolutionsHistory() {
    }

    public SolutionsHistory(ObjectId id, @NotNull Method method, @NotNull List<SolutionWithReagents> solutionsWithReagents, @NotNull Date solutionCreationDate) {
        setId(id);
        setMethod(method);
        setSolutionCreationDate(solutionCreationDate);
        setSolutionsWithReagentsList(new ArrayList<>());
        for (SolutionWithReagents solutionWithReagents : solutionsWithReagents) {
            solutionsWithReagentsList.add(solutionWithReagents);
        }
    }


//    public SolutionsHistory(ObjectId id, @NotNull Method method, @NotNull List<SolutionWithReagents> solutionsWithReagents, @NotNull Date solutionCreationDate) {
//        setId(id);
//        setMethod(method);
//        setSolutionCreationDate(solutionCreationDate);
//        setSolutionsWithReagentsList(new ArrayList<>());
//        for (SolutionWithReagents solutionWithReagents : solutionsWithReagents) {
//            solutionsWithReagentsList.add(solutionWithReagents);
//        }
//    }

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

    public List<SolutionWithReagents> getSolutionsWithReagentsList() {
        return solutionsWithReagentsList;
    }

    public void setSolutionsWithReagentsList(List<SolutionWithReagents> solutionsWithReagents) {
        this.solutionsWithReagentsList = solutionsWithReagents;
    }

    public Date getSolutionCreationDate() {
        return solutionCreationDate;
    }

    public void setSolutionCreationDate(Date solutionCreationDate) {
        this.solutionCreationDate = solutionCreationDate;
    }
}
