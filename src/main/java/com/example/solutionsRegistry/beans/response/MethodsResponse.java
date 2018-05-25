package com.example.solutionsRegistry.beans.response;

import com.example.solutionsRegistry.beans.documents.Method;

public class MethodsResponse extends Response {
    String id;
    String methodTitle;

    public MethodsResponse() {
    }

    public MethodsResponse(Method method) {
        this.id = String.valueOf(method.getId());
        this.methodTitle = method.getMethodTitle();
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
}
