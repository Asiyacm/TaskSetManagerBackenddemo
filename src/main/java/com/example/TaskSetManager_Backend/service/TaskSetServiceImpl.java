package com.example.TaskSetManager_Backend.service;

import com.example.TaskSetManager_Backend.model.dao.Facilities;
import com.example.TaskSetManager_Backend.model.dao.TaskSet;
import com.example.TaskSetManager_Backend.model.dto.EvUnFaDto;
import com.example.TaskSetManager_Backend.model.dto.TaskSetDto;
import com.example.TaskSetManager_Backend.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TaskSetServiceImpl implements TaskSetService {

    @Autowired
    TaskSetRepository taskSetRepository ;
    @Autowired
    EventRepository eventRepository;
    @Autowired
    FacilitiesRepository facilitiesRepository;
    @Autowired
    UnitRepository unitRepository;
    @Autowired
    TaskRepository taskRepository;



    @Override
    public List<TaskSet> viewAll() {

        return taskSetRepository.findAll();
    }


    @Override
    public String deleteTaskSetById(int id) {
        Optional<TaskSet> taskSet = taskSetRepository.findById(id);
        System.out.println(taskSet.get().isAssigned());
        if (taskSet.get().isAssigned() == false) {
            taskSet.get().setDeleted(true);
            taskSetRepository.save(taskSet.get());
            return "Deleted";
        }
        return "Invaild Deletion";
    }






    @Override
    public EvUnFaDto getEvUnFaList(TaskSet taskSet) {
        EvUnFaDto eufDto = new EvUnFaDto();
        eufDto.setEvent(eventRepository.findAll());
        eufDto.setFacilities(facilitiesRepository.findAll());
        eufDto.setUnit(unitRepository.findAll());
        eufDto.setTask(taskRepository.findAll());
        return eufDto;
    }

    @Override
    public List<TaskSetDto> getTaskSetList() {
        List<TaskSetDto> taskSetDto=new ArrayList<>();
        taskSetDto = taskSetRepository.findAll().stream().map(taskSet -> new TaskSetDto(taskSet.getTaskSetId(),
                taskSet.getTaskSetName(),
                taskSet.getTaskSetDescription(),
                taskSet.isApplyToAllFacilitiesAndUnit(),
                taskSet.isAssigned(),
                taskSet.isDeleted(),
                taskSet.getUnit(),
                taskSet.getFacilities(),
                taskSet.getEvent(),taskSet.getTask())).collect(Collectors.toList());

        System.out.println(taskSetDto);
        return taskSetDto;


}

//
//package com.example.TaskSetManager_Backend.service;
//
//        import com.example.TaskSetManager_Backend.dao.TaskSetTemplateDao;
//        import com.example.TaskSetManager_Backend.model.TaskSetTemplate;
//        import org.springframework.beans.factory.annotation.Autowired;
//        import org.springframework.stereotype.Service;
//
//@Service
//public class TaskSetTemplateServiceImpl implements TaskSetTemplateService {
//
//
//
//    @Override
//    public List<TaskSetTemplate> getAll TaskSetTemplate() {
//        return TaskSetTemplateDao.findAll();
//    }
//
//    @Override
//    public void saveEmployee(Employee employee) {
//        this.employeeRepository.save(employee);
//    }
//
//    @Override
//    public Employee getEmployeeById(long id) {
//        Optional<Employee> optional = employeeRepository.findById(id);
//        Employee employee = null;
//        if (optional.isPresent()) {
//            employee = optional.get();
//        } else {
//            throw new RuntimeException(" Employee not found for id :: " + id);
//        }
//        return employee;
//    }
//
//    @Override
//    public void deleteEmployeeById(long id) {
//        this.employeeRepository.deleteById(id);
//    }
//
//    @Override
//    public Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
//        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
//                Sort.by(sortField).descending();
//
//        Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
//        return this.employeeRepository.findAll(pageable);
//    }
//}

//        @Override
//        public void softDeleteTaskIfNotAssigned(int id) {
//            taskRepository.delete(id);
//        }
}
