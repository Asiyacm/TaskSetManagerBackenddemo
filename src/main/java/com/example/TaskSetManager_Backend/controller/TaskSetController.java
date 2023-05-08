package com.example.TaskSetManager_Backend.controller;

import com.example.TaskSetManager_Backend.model.dao.TaskSet;
import com.example.TaskSetManager_Backend.model.dto.TaskSetDto;
import com.example.TaskSetManager_Backend.service.TaskSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskSetController {

    @Autowired
    TaskSetService taskSetService;

    @CrossOrigin(origins = "*")
    @GetMapping(path = "/gettaskSetList")
    public List<TaskSetDto> view() {
        List<TaskSetDto> taskSetDtoList =  taskSetService.getTaskSetList();
        System.out.println(taskSetDtoList);
        return taskSetDtoList;
    }


    @CrossOrigin
    @DeleteMapping("/delete/{id}")
    public String deleteTaskSetById(@PathVariable(value = "id") Integer TaskSetId) {
        taskSetService.deleteTaskSetById(TaskSetId);
    return "{\"status\":\"success\"}";
    }
}


//        @Autowired
//        private TaskSetTemplateService taskSetTemplateService;
//
//        @PostMapping("/{TaskSetTemplateId}/delete")
//        public void softDeleteTaskIfNotAssigned(@PathVariable Integer TaskSetTemplateId) {
//            taskSetTemplateService.softDeleteTaskIfNotAssigned(TaskSetTemplateId);
//        }





//    @CrossOrigin(origins = "*")
//    @PostMapping(path="/delete",consumes = "application/json",produces = "application/json")
//    public HashMap<String,String> taskDelete(@RequestBody TaskSet T){
//        String id= String.valueOf(T.getTaskSetId());
//        System.out.println(id);
//        dao.deleteTask(T.getTaskSetId());
//        HashMap<String,String> map= new HashMap<>();
//        map.put("status","success");
//        return map;





//    @RestController
//@RequestMapping("/api/tasksettemplates")
//public class TaskSetTemplateController {
//
//    @Autowired
//    private TaskSetTemplateService taskSetTemplateService;
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<String> deleteTaskSetTemplate(@PathVariable long id) {
//        taskSetTemplateService.deleteIfNotAssignedToPatient(id);
//        return ResponseEntity.ok("Task set template deleted");
//    }








