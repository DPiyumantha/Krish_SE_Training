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

import com.dimalka.projectmanager.commons.model.projectservice.Project;
import com.dimalka.projectmanager.commons.model.taskservice.Task;
import com.dimalka.service.ProjectServiceImpl;

@RestController
public class MainController {
    @Autowired
    ProjectServiceImpl projectServiceImpl;

    //Basic CRUD
    @PostMapping(value = "/project")
    public ResponseEntity<Project> createProject(@RequestBody Project project) {
        return new ResponseEntity<Project>(projectServiceImpl.saveProject(project), HttpStatus.CREATED);
    }

    @GetMapping(value = "/project/{id}")
    public Project getProjectById(@PathVariable("id") int id) {
        return projectServiceImpl.getProjectById(id);
    }

    @GetMapping(value = "/project")
    public List<Project> getAllProjects() {

        return projectServiceImpl.getAllProjects();

    }

    @PatchMapping(value = "/project/{id}")
    public int updateProject(@PathVariable int id, @RequestBody Project project) {
        return projectServiceImpl.updateProjectById(project.getProjectName(), project.getStatus(),
                project.getProjectId());
    }

    @DeleteMapping(value = "/project/{id}")
    public ResponseEntity<Integer> deleteProjectById(@PathVariable("id") int id) {
        projectServiceImpl.deleteProjectById(id);
        return new ResponseEntity<Integer>(id, HttpStatus.OK);
    }

    //For Filtering
    @GetMapping(value = "/project", params = {"status"})
    public List<Project> getProjectsByStatus(@RequestParam("status") String status) {
        return projectServiceImpl.getAllProjectsByStatus(status);

    }

    @GetMapping(value = "/project", params = {"projectClient"})
    public List<Project> getProjectsByClient(@RequestParam("projectClient") String projectClient) {
        return projectServiceImpl.getAllProjectsByClient(projectClient);

    }

    // To get all the tasks from the task-service which are relevant to a project
    @GetMapping(value = "/project/{id}/tasks")
    public List<Task> getAllTaskOfProject(@PathVariable("id") Integer id) {
        return projectServiceImpl.getAllTaskOfProject(id);
    }

//	@GetMapping(value = "/project", params = { "status", "projectClient", "deadLine" })
//	public List<Project> getFilteredProjects(
//	@RequestParam("status") String status, 
//	@RequestParam("projectClient") String projectClient, 
//	@RequestParam("deadLine") String deadLine) {
//
//		return projectServiceImpl.getFilteredProjects(status, projectClient, deadLine);
//
//	}

}
