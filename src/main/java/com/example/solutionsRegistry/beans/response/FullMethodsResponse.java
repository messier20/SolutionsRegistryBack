package com.example.solutionsRegistry.beans.response;

import com.example.solutionsRegistry.beans.documents.Method;
import com.example.solutionsRegistry.beans.documents.SolutionWithReagents;
import org.bson.types.ObjectId;

import java.util.List;

public class FullMethodsResponse extends Response {

    private String id;
    private String methodTitle;
    private List<SolutionWithReagents> solutionWithReagentsList;

    public FullMethodsResponse() {
    }

    public FullMethodsResponse(Method method, List<SolutionWithReagents> solutionWithReagentsList) {
        this.id = String.valueOf(method.getId());
        this.methodTitle = method.getMethodTitle();
        this.solutionWithReagentsList = solutionWithReagentsList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMethodTitle() {
        return methodTitle;
    }

    public void setMethodTitle(String methodTitle) {
        this.methodTitle = methodTitle;
    }

    public List<SolutionWithReagents> getSolutionWithReagentsList() {
        return solutionWithReagentsList;
    }

    public void setSolutionWithReagentsList(List<SolutionWithReagents> solutionWithReagentsList) {
        this.solutionWithReagentsList = solutionWithReagentsList;
    }
}
