package jsf.model;

import ejb.EmployeeFacade;
import jpa.Employee;
import lombok.Getter;
import lombok.Setter;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

@ManagedBean(name = "employeeBean")
@SessionScoped
public class EmployeeBean implements Serializable {
    @EJB
    private EmployeeFacade employeeFacade;
    @Getter
    @Setter
    private Employee selectedEmployee;

    @Getter
    @Setter
    private String date;
    @Getter
    @Setter
    private int hours;

    public List<Employee> getEmployees() {
        return employeeFacade.getAllEmployeesForCorrespondentProject(getParam());
    }

    public Employee getEmployeeById() {
        return employeeFacade.getEmployeeById(getParam());
    }

    public int getParam() {
        FacesContext context = FacesContext.getCurrentInstance();
        Map<String, String> paramMap = context.getExternalContext().getRequestParameterMap();
        String projectId = paramMap.get("id");
        return Integer.parseInt(projectId);
    }
}