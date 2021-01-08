package com.dimalka.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.dimalka.projectmanager.commons.model.projectservice.Project;
import com.dimalka.repository.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	ProjectRepository projectRepository;

	@Override
	public Project saveProject(Project project) {
		return projectRepository.save(project);
	}

	@Override
	public List<Project> getAllProjects() {
		return projectRepository.findAll();
	}

	@Override
	public Project getProjectById(int id) {
		Optional<Project> result = projectRepository.findById(id);
		if (result.isPresent()) {
			return result.get();
		} else {
			System.out.println("No project with id:" + id);
			return null;
		}
	}

	@Override
	public List<Project> getAllProjectsByStatus(String status) {
		return projectRepository.findByStatus(status);
	}

	@Override
	public void deleteProjectById(int id) {
//		try {
//			projectRepository.deleteById(id);
//			return new ResponseEntity<String>("Deleted project with id " + id, HttpStatus.OK);
//		} catch (Exception exception) {
//			return new ResponseEntity<String>("No project with id " + id, HttpStatus.NOT_FOUND);
//		}
		
		 projectRepository.deleteById(id);

	}

	@Override
	public int updateProjectById(String projectName, String projectStatus, int projectId) {
		return projectRepository.updateProjectById(projectName, projectStatus, projectId);
	}

}
