package com.example.TaskSetManager_Backend.model.dto;

import com.example.TaskSetManager_Backend.model.dao.Event;
import com.example.TaskSetManager_Backend.model.dao.Facilities;
import com.example.TaskSetManager_Backend.model.dao.Task;
import com.example.TaskSetManager_Backend.model.dao.Unit;

import java.util.Set;

public class TaskSetDto {
    private int id;

    private String taskSetName;
    private String taskSetDescription;
    private boolean applyToAllFacilitiesAndUnit;
    private boolean isAssigned=true;
    private boolean isDeleted=false;
    private Unit unit;
    private Facilities facilities;
    private Event event;
    private Set<Task> task;

    public TaskSetDto() {
    }

    public TaskSetDto(int id,String taskSetName, String taskSetDescription, boolean applyToAllFacilitiesAndUnit, boolean isAssigned, boolean isDeleted, Unit unit, Facilities facilities, Event event, Set<Task> task) {
        this.id=id;
        this.taskSetName = taskSetName;
        this.taskSetDescription = taskSetDescription;
        this.applyToAllFacilitiesAndUnit = applyToAllFacilitiesAndUnit;
        this.isAssigned = isAssigned;
        this.isDeleted = isDeleted;
        this.unit = unit;
        this.facilities = facilities;
        this.event = event;
        this.task = task;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaskSetName() {
        return taskSetName;
    }

    public void setTaskSetName(String taskSetName) {
        this.taskSetName = taskSetName;
    }

    public String getTaskSetDescription() {
        return taskSetDescription;
    }

    public void setTaskSetDescription(String taskSetDescription) {
        this.taskSetDescription = taskSetDescription;
    }

    public boolean isApplyToAllFacilitiesAndUnit() {
        return applyToAllFacilitiesAndUnit;
    }

    public void setApplyToAllFacilitiesAndUnit(boolean applyToAllFacilitiesAndUnit) {
        this.applyToAllFacilitiesAndUnit = applyToAllFacilitiesAndUnit;
    }

    public boolean isAssigned() {
        return isAssigned;
    }

    public void setAssigned(boolean assigned) {
        isAssigned = assigned;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public Facilities getFacilities() {
        return facilities;
    }

    public void setFacilities(Facilities facilities) {
        this.facilities = facilities;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Set<Task> getTask() {
        return task;
    }

    public void setTask(Set<Task> task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "TaskSetDto{" +
                "id=" + id +
                ", taskSetName='" + taskSetName + '\'' +
                ", taskSetDescription='" + taskSetDescription + '\'' +
                ", applyToAllFacilitiesAndUnit=" + applyToAllFacilitiesAndUnit +
                ", isAssigned=" + isAssigned +
                ", isDeleted=" + isDeleted +
                ", unit=" + unit +
                ", facilities=" + facilities +
                ", event=" + event +
                ", task=" + task +
                '}' ;
    }
}
