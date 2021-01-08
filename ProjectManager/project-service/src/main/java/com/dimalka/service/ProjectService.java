package com.dimalka.service;

import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dimalka.projectmanager.commons.model.projectservice.Project;



public interface ProjectService  {
	
	List<Project> getAllProjectsByClient(@Param("projectClient") String projectClient);
	List<Project> getAllProjectsByStatus(@Param("status") String status);
	Project saveProject(Project project);

	List<Project> getAllProjects();

	Project getProjectById(int id);

	void deleteProjectById(int id);

	int updateProjectById(String projectName, String projectStatus, int projectId);
	
	public List<Project> getFilteredProjects(String status, String projectClient, String deadLine);
}
 