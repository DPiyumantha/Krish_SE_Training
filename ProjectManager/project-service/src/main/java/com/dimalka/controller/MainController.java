package com.dimalka.controller;

import java.util.List;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.logging.LogFile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dimalka.projectmanager.commons.model.projectservice.Project;
import com.dimalka.service.ProjectServiceImpl;

@RestController
public class MainController {
	private final org.jboss.logging.Logger LOGGER = LoggerFactory.logger(this.getClass());
	@Autowired
	ProjectServiceImpl projectServiceImpl;

	@GetMapping(value = "/")
	public String hello() {
		return "Hello world";
	}

	@GetMapping(value = "/project", params = { "status" })
	public List<Project> viewAllProjects(@RequestParam("status") String status) {

		return projectServiceImpl.getAllProjectsByStatus(status);

	}

	@GetMapping(value = "/project")
	public List<Project> viewAllProjects() {

		return projectServiceImpl.getAllProjects();

	}

	@GetMapping(value = "/project/{id}")
	public Project getProjectById(@PathVariable("id") int id) {
		return projectServiceImpl.getProjectById(id);
	}

	@DeleteMapping(value = "/project/{id}")
	public ResponseEntity<String> deleteProjectById(@PathVariable("id") int id) {
		try {
			projectServiceImpl.deleteProjectById(id);
			return new ResponseEntity<String>("Deleted project with id " + id, HttpStatus.OK);
		} catch (Exception exception) {

			LOGGER.info("ddgdgd");
			return new ResponseEntity<String>("No project with id " + id, HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping(value = "/project")
	public Project createProject(@RequestBody Project project) {
		System.out.println(project);
		return projectServiceImpl.saveProject(project);
	}

	@PatchMapping(value = "/project/{id}")
	public int updateProject(@PathVariable int id, @RequestBody Project project) {
		return projectServiceImpl.updateProjectById(project.getProjectName(), project.getStatus(),
				project.getProjectId());
	}
}
