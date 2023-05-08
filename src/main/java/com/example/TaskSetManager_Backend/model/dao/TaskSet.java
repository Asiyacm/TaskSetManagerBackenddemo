package com.example.TaskSetManager_Backend.model.dao;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TaskSet")
public class TaskSet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int taskSetId;
    private String taskSetName;
    private String taskSetDescription;
    private boolean applyToAllFacilitiesAndUnit = false;
    private boolean isAssigned;
    private boolean isDeleted = false;



    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "event_id", nullable = false)
    private Event event;
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "facilities_id", nullable = false)
    private Facilities facilities;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "unit_id", nullable = false)
    private Unit unit;


    @ManyToMany
    @JoinTable(name = "taskSet_task", joinColumns = @JoinColumn(name = "taskSet_id"),
            inverseJoinColumns = @JoinColumn(name = "task_id"))
    private Set<Task> task = new HashSet<>();


    public TaskSet() {
    }

    public TaskSet(int taskSetId, String taskSetName, String taskSetDescription, boolean applyToAllFacilitiesAndUnit, boolean isAssigned, boolean isDeleted, Event event, Facilities facilities, Unit unit, Set<Task> task) {
        this.taskSetId = taskSetId;
        this.taskSetName = taskSetName;
        this.taskSetDescription = taskSetDescription;
        this.applyToAllFacilitiesAndUnit = applyToAllFacilitiesAndUnit;
        this.isAssigned = isAssigned;
        this.isDeleted = isDeleted;
        this.event = event;
        this.facilities = facilities;
        this.unit = unit;
        this.task = task;
    }

    public int getTaskSetId() {
        return taskSetId;
    }

    public void setTaskSetId(int taskSetId) {
        this.taskSetId = taskSetId;
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

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Facilities getFacilities() {
        return facilities;
    }

    public void setFacilities(Facilities facilities) {
        this.facilities = facilities;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public Set<Task> getTask() {
        return task;
    }

    public void setTask(Set<Task> task) {
        this.task = task;
    }
}
