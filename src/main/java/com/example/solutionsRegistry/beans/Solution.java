package com.example.solutionsRegistry.beans;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;

public class Solution {

    @Id
    private ObjectId solutionId;
    @NotNull
    private Double solutionCode;
    @NotNull
    private String solutionTitle;
    @NotNull
    private String solutionValidityDuration;

    private ObjectId methodId;

    public Solution(ObjectId solutionId,
                    @NotNull Double solutionCode,
                    @NotNull String solutionTitle,
                    @NotNull String solutionValidityDuration,
                    ObjectId methodId
    ) {
        setSolutionId(solutionId);
        setSolutionCode(solutionCode);
        setSolutionTitle(solutionTitle);
        setSolutionValidityDuration(solutionValidityDuration);
        setMethodId(methodId);
    }

    public void setMethodId(ObjectId methodId) {
        this.methodId = methodId;
    }

    public ObjectId getSolutionId() {
        return solutionId;
    }

    public void setSolutionId(ObjectId solutionId) {
        this.solutionId = solutionId;
    }

    public Double getSolutionCode() {
        return solutionCode;
    }

    public void setSolutionCode(Double solutionCode) {
        this.solutionCode = solutionCode;
    }

    public String getSolutionTitle() {
        return solutionTitle;
    }

    public void setSolutionTitle(String solutionTitle) {
        this.solutionTitle = solutionTitle;
    }

    public String getSolutionValidityDuration() {
        return solutionValidityDuration;
    }

    public void setSolutionValidityDuration(String solutionValidityDuration) {
        this.solutionValidityDuration = solutionValidityDuration;
    }

    public ObjectId getMethodId() {
        return methodId;
    }
}
