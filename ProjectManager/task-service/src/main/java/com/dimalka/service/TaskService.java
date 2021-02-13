package com.dimalka.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dimalka.projectmanager.commons.model.taskservice.Task;


@Service
public interface TaskService {

    List<Task> getAllTasksByProjectId(@Param("id") int id);

    Task savetask(Task task) throws Exception;

    List<Task> getAllTask();

    Task getTaskById(int id) throws Exception;

    void deleteTaskById(int id);

    public int updateTask(Task task, int id);
}
