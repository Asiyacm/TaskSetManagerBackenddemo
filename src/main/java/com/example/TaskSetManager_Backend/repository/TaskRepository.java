package com.example.TaskSetManager_Backend.repository;

import com.example.TaskSetManager_Backend.model.dao.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Integer> {
}
