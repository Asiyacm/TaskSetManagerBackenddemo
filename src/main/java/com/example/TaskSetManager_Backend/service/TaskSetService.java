package com.example.TaskSetManager_Backend.service;

import com.example.TaskSetManager_Backend.model.dao.TaskSet;
import com.example.TaskSetManager_Backend.model.dto.EvUnFaDto;
import com.example.TaskSetManager_Backend.model.dto.TaskSetDto;
import com.example.TaskSetManager_Backend.repository.TaskSetRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface TaskSetService {

    List<TaskSet> viewAll();

    String deleteTaskSetById(int id);


    List<TaskSetDto> getTaskSetList();
    EvUnFaDto getEvUnFaList(TaskSet taskSet);

}
