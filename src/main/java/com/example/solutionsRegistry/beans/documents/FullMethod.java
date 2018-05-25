package com.example.solutionsRegistry.beans.documents;

import java.util.ArrayList;
import java.util.List;

public class FullMethod {
    private Method method;
    private List<SolutionWithReagents> solutionWithReagentsList;

    public FullMethod(Method method, List<SolutionWithReagents> solutionsWithReagents) {
        setMethod(method);
        setSolutionWithReagentsList(new ArrayList<>());
        for (SolutionWithReagents solutionWithReagents : solutionsWithReagents) {
            solutionWithReagentsList.add(solutionWithReagents);
        }
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }


    public List<SolutionWithReagents> getSolutionWithReagentsList() {
        return solutionWithReagentsList;
    }

    public void setSolutionWithReagentsList(List<SolutionWithReagents> solutionWithReagentsList) {
        this.solutionWithReagentsList = solutionWithReagentsList;
    }
}
