package com.merdekacloud.jobBoard.Controllers;

import com.merdekacloud.jobBoard.Models.Project;
import com.merdekacloud.jobBoard.Repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectControllers {
    @Autowired
    ProjectRepository projectRepository;

    @GetMapping("/projects")
    public List<Project> getAllProjects(){
        return projectRepository.findAll();

    }

    @PostMapping("/project")
    public Project createAProject(@RequestBody Project project){
        return projectRepository.save(project);
    }
}
