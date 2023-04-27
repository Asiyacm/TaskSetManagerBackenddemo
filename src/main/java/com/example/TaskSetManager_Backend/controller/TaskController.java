package com.example.TaskSetManager_Backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {

    @GetMapping("/task")
    public String TaskPage() {
        return "Task";
    }

}
