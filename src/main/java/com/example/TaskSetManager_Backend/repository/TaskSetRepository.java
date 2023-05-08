package com.example.TaskSetManager_Backend.repository;

import com.example.TaskSetManager_Backend.model.dao.TaskSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskSetRepository extends JpaRepository<TaskSet,Integer> {

    @Query(value = "SELECT * FROM `task_set` WHERE `is_deleted`=0",nativeQuery = true)
    public List<TaskSet> viewTaskSet();
}

//                @Transactional
//                @Modifying
//                @Query("UPDATE `task_set_template` t SET t.is_deleted = true WHERE t.task_set_id =:task_set_id AND t.is_assigned is false")
//                void softDeleteByIdIfNotAssigned(Integer TaskSetTemplateId);


    // @Query(value = "SELECT * FROM `task_set` WHERE `assigned`=:assigned",nativeQuery = true)
//    @Modifying
//    @Transactional
//    @Query(value = "UPDATE `task_set` SET `assigned`= : assigned WHERE `task_set_id`=:task_set_id",nativeQuery = true)
//    void deleteTask(@Param("task_set_id") Integer task_set_id ,@Param("assigned") Integer assigned);

//        @Query("SELECT COUNT(pt) FROM PatientTask pt WHERE pt.taskSetTemplate = :template")
//        long countPatientsAssignedToTemplate(@Param("template") TaskSetTemplate template);
//
//        @Modifying
//        @Query("DELETE FROM TaskSetTemplate t WHERE t.id = :id AND NOT EXISTS " +
//                "(SELECT pt FROM PatientTask pt WHERE pt.taskSetTemplate = t)")
//        void deleteIfNotAssignedToPatient(@Param("id") long id);


