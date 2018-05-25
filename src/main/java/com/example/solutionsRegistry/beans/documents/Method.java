package com.example.solutionsRegistry.beans.documents;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;

public class Method {
    @Id
    public ObjectId id;
    @NotNull
    private String methodTitle;


    public Method(ObjectId id, @NotNull String methodTitle) {
        setId(id);
        setMethodTitle(methodTitle);
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getMethodTitle() {
        return methodTitle;
    }

    public void setMethodTitle(String methodTitle) {
        this.methodTitle = methodTitle;
    }
}
