package com.dimalka.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dimalka.projectmanager.commons.model.projectservice.Project;
import com.dimalka.projectmanager.commons.model.taskservice.Task;
import com.dimalka.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepository taskRepository;

    @Bean
    RestTemplate getRestTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    ;

    @Autowired
    RestTemplate restTemplate;

    @Override
    public List<Task> getAllTasksByProjectId(int id) {
        return taskRepository.findByProjectId(id);

    }


    @Override
    public List<Task> getAllTask() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTaskById(int id) {
        Optional<Task> task = taskRepository.findById(id);
        return task.get();
    }

    @Override
    public Task savetask(Task task) throws Exception {
        Project project = getProjectById(task.getProjectId());
        if (project == null) {
            throw new Exception();

        } else {
            return taskRepository.save(task);
        }
    }


    private Project getProjectById(int id) {
        Project project = restTemplate.getForObject("http://project/project/" + id, Project.class);
        System.out.println(project);
        return project;
    }


    public int updateTask(Task task, int id) {
        return taskRepository.updateTask(
                task.getTaskName(),
                task.getProjectId(),
                task.getProgress(),
                task.getMember(),
                id
        );
    }


    public void deleteTaskById(int id) {
        taskRepository.deleteById(id);

    }


}
