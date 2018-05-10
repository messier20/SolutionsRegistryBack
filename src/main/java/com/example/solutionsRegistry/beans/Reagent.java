package com.example.solutionsRegistry.beans;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import javax.validation.constraints.NotNull;

public class Reagent {

    @Id
    private ObjectId reagentId;

    private String reagentCode;
    @NotNull
    private String capacity;
    @NotNull
    private String solutionComponent;
    @NotNull
    private String reagentValidityDuration;

    private ObjectId solutionId;

    public Reagent(ObjectId reagentId,
                   String reagentCode,
                   @NotNull String capacity,
                   @NotNull String solutionComponent,
                   @NotNull String reagentValidityDuration,
                   ObjectId solutionId
    ) {
        setReagentId(reagentId);
        setReagentCode(reagentCode);
        setCapacity(capacity);
        setSolutionId(solutionId);
        setSolutionComponent(solutionComponent);
        setReagentValidityDuration(reagentValidityDuration);


    }

    public ObjectId getReagentId() {
        return reagentId;
    }

    public void setReagentId(ObjectId reagentId) {
        this.reagentId = reagentId;
    }

    public String getReagentCode() {
        return reagentCode;
    }

    public void setReagentCode(String reagentCode) {
        this.reagentCode = reagentCode;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getSolutionComponent() {
        return solutionComponent;
    }

    public void setSolutionComponent(String solutionComponent) {
        this.solutionComponent = solutionComponent;
    }

    public String getReagentValidityDuration() {
        return reagentValidityDuration;
    }

    public void setReagentValidityDuration(String reagentValidityDuration) {
        this.reagentValidityDuration = reagentValidityDuration;
    }

    public ObjectId getSolutionId() {
        return solutionId;
    }

    public void setSolutionId(ObjectId solutionId) {
        this.solutionId = solutionId;
    }
}
