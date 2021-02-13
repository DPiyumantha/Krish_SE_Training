package com.dimalka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dimalka.projectmanager.commons.model.taskservice.Task;
import com.dimalka.repository.TaskRepository;
import com.dimalka.service.TaskServiceImpl;


@RestController
public class MainController {

    @Autowired
    TaskServiceImpl taskServiceImpl;

    //Basic CRUD
    @PostMapping(value = "/task")
    Task createTask(@RequestBody Task task) throws Exception {
        return taskServiceImpl.savetask(task);

    }

    @GetMapping(value = "/task")
    List<Task> getAllTasks() {
        return taskServiceImpl.getAllTask();
    }

    @GetMapping(value = "/task/{id}")
    Task getTaskById(@PathVariable("id") int id) {
        return taskServiceImpl.getTaskById(id);
    }

    @PatchMapping(value = "/task/{id}")
    int updateTask(@RequestBody Task task, @PathVariable int id) {
        return taskServiceImpl.updateTask(task, id);
    }

    @DeleteMapping(value = "/task/{id}")
    public ResponseEntity<Integer> deleteProjectById(@PathVariable("id") int id) {
        taskServiceImpl.deleteTaskById(id);
        return new ResponseEntity<Integer>(id, HttpStatus.OK);
    }

    @GetMapping(value = "/task", params = {"projectId"})
    List<Task> getAllTasksByProjectIds(@RequestParam("projectId") int id) {
        return taskServiceImpl.getAllTasksByProjectId(id);
    }


}
