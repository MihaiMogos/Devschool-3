package ejb;

import jpa.Project;

import java.util.List;

public interface ProjectFacade {
    List<Project> getAllProjects();

    List<Project> getAllProjectsForCorrespondentTeam(int teamId);
}
