package uni.pu.fmi.project.model;

import uni.pu.fmi.models.Participant;
import uni.pu.fmi.project.service.ProjectService;

public class ProjectModel {
    private String projectName;
    private String description;
    private Participant projectCreator;
    private String message;

    public void setProjectName(final String name) {
        // TODO Auto-generated method stub
        this.projectName = name;
    }

    public void setDescription(final String description) {
        // TODO Auto-generated method stub
        this.description = description;
    }

    public void setProjectCreator(final Participant creator) {
        // TODO Auto-generated method stub
        this.projectCreator = creator;
    }

    public void createProjectButtonPressed() {
        // TODO Auto-generated method stub
        message = ProjectService.create(projectName,description,projectCreator);
    }

    public String getMessage() {
        // TODO Auto-generated method stub
        return message;
    }
}
