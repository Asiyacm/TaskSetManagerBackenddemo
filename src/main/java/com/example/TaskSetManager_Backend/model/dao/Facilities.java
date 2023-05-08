package com.example.TaskSetManager_Backend.model.dao;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Facilities")
public class Facilities {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int facilitiesId;
    private String facilitiesName;
    private boolean isFacilitiesDeleted=false;

    public Facilities() {
    }

    public Facilities(int facilitiesId, String facilitiesName, boolean isFacilitiesDeleted) {
        this.facilitiesId = facilitiesId;
        this.facilitiesName = facilitiesName;
        this.isFacilitiesDeleted = isFacilitiesDeleted;
    }

    public int getFacilitiesId() {
        return facilitiesId;
    }

    public void setFacilitiesId(int facilitiesId) {
        this.facilitiesId = facilitiesId;
    }

    public String getFacilitiesName() {
        return facilitiesName;
    }

    public void setFacilitiesName(String facilitiesName) {
        this.facilitiesName = facilitiesName;
    }

    public boolean isFacilitiesDeleted() {
        return isFacilitiesDeleted;
    }

    public void setFacilitiesDeleted(boolean facilitiesDeleted) {
        isFacilitiesDeleted = facilitiesDeleted;
    }
}