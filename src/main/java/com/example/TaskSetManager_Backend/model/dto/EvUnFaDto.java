package com.example.TaskSetManager_Backend.model.dto;

import com.example.TaskSetManager_Backend.model.dao.Event;
import com.example.TaskSetManager_Backend.model.dao.Facilities;
import com.example.TaskSetManager_Backend.model.dao.Task;
import com.example.TaskSetManager_Backend.model.dao.Unit;

import java.util.List;
import java.util.Set;

public class EvUnFaDto {
    private List<Event> event;
    private List<Facilities> facilities;
    private List<Unit> unit;
    private List<Task> task;

    public EvUnFaDto() {
    }

    public EvUnFaDto(List<Event> event, List<Facilities> facilities, List<Unit> unit, List<Task> task) {
        this.event = event;
        this.facilities = facilities;
        this.unit = unit;
        this.task = task;
    }

    public List<Event> getEvent() {
        return event;
    }

    public void setEvent(List<Event> event) {
        this.event = event;
    }

    public List<Facilities> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<Facilities> facilities) {
        this.facilities = facilities;
    }

    public List<Unit> getUnit() {
        return unit;
    }

    public void setUnit(List<Unit> unit) {
        this.unit = unit;
    }

    public List<Task> getTask() {
        return task;
    }

    public void setTask(List<Task> task) {
        this.task = task;
    }
}
