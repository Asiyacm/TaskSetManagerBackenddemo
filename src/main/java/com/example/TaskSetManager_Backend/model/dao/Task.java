package com.example.TaskSetManager_Backend.model.dao;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int taskId;
    private String taskName;
    private boolean isTaskDeleted=false;


    @JsonBackReference
    @ManyToMany(mappedBy = "task")
    private Set<TaskSet> taskSet = new HashSet<>();

    public Task() {
    }

    public Task(int taskId, String taskName, boolean isTaskDeleted, Set taskSet) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.isTaskDeleted = isTaskDeleted;
        this.taskSet = taskSet;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public boolean isTaskDeleted() {
        return isTaskDeleted;
    }

    public void setTaskDeleted(boolean taskDeleted) {
        isTaskDeleted = taskDeleted;
    }

    public Set getTaskSet() {
        return taskSet;
    }

    public void setTaskSet(Set taskSet) {
        this.taskSet = taskSet;
    }
}