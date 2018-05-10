package com.example.solutionsRegistry.beans;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;

public class Method {
    @Id
    public ObjectId methodId;
    @NotNull
    private String methodTitle;


    public Method(ObjectId methodId, @NotNull String methodTitle) {
        setMethodId(methodId);
        setMethodTitle(methodTitle);
    }

    public ObjectId getMethodId() {
        return methodId;
    }

    public void setMethodId(ObjectId methodId) {
        this.methodId = methodId;
    }

    public String getMethodTitle() {
        return methodTitle;
    }

    public void setMethodTitle(String methodTitle) {
        this.methodTitle = methodTitle;
    }
}
