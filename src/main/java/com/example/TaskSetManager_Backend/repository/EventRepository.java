package com.example.TaskSetManager_Backend.repository;

import com.example.TaskSetManager_Backend.model.dao.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event,Integer>
{
}
