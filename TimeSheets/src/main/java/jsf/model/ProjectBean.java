package jsf.model;

import ejb.ProjectFacade;
import jpa.Project;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

@ManagedBean(name = "projectBean")
@SessionScoped
public class ProjectBean implements Serializable {
    @EJB
    private ProjectFacade projectFacade;

    public List<Project> getProjects() {
        return projectFacade.getAllProjectsForCorrespondentTeam(getParam());
    }

    public int getParam() {
        FacesContext context = FacesContext.getCurrentInstance();
        Map<String, String> paramMap = context.getExternalContext().getRequestParameterMap();
        String projectId = paramMap.get("id");
        return Integer.parseInt(projectId);
    }
}