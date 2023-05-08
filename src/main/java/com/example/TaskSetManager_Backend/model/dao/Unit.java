package com.example.TaskSetManager_Backend.model.dao;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Unit")
public class Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int unitId;
    private String unitName;
    private boolean isUnitDeleted=false;

    public Unit() {
    }

    public Unit(int unitId, String unitName, boolean isUnitDeleted) {
        this.unitId = unitId;
        this.unitName = unitName;
        this.isUnitDeleted = isUnitDeleted;
    }


    public int getUnitId() {
        return unitId;
    }

    public void setUnitId(int unitId) {
        this.unitId = unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public boolean isUnitDeleted() {
        return isUnitDeleted;
    }

    public void setUnitDeleted(boolean unitDeleted) {
        isUnitDeleted = unitDeleted;
    }
}