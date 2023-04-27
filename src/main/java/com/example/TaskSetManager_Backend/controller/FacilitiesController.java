package com.example.TaskSetManager_Backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FacilitiesController {

    @GetMapping("/facilities")
    public String FacilitiesPage() {
        return "Facilities";
    }

}
