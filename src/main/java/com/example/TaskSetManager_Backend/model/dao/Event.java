package com.example.TaskSetManager_Backend.model.dao;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "Event")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int eventId;
    private String eventName;
    private boolean isEventDeleted = false;

    public Event() {
    }

    public Event(int eventId, String eventName, boolean isEventDeleted) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.isEventDeleted = isEventDeleted;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public boolean isEventDeleted() {
        return isEventDeleted;
    }

    public void setEventDeleted(boolean eventDeleted) {
        isEventDeleted = eventDeleted;
    }
}