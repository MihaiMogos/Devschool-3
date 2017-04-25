package jsf.model.project;

import ejb.ProjectFacade;
import jpa.Project;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.io.Serializable;
import java.util.List;

@ManagedBean(name = "projectBean")
@RequestScoped
public class ProjectBean implements Serializable {
    @EJB
    private ProjectFacade projectFacade;

    public List<Project> getProjects() {
        return projectFacade.getAllProjects();
    }
}