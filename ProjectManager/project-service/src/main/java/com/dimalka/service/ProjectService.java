package com.dimalka.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.dimalka.projectmanager.commons.model.projectservice.Project;



public interface ProjectService  {
	
	
	List<Project> getAllProjectsByStatus(@Param("status") String status);
	Project saveProject(Project project);

	List<Project> getAllProjects();

	Project getProjectById(int id);

	void deleteProjectById(int id);

	int updateProjectById(String projectName, String projectStatus, int projectId);
	
}
 