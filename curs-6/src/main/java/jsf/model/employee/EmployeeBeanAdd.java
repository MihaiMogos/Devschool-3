package jsf.model.employee;

import ejb.EmployeeFacade;
import jpa.Employee;
import lombok.Getter;
import lombok.Setter;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean(name = "employeeBeanAdd")
@RequestScoped
@Setter
@Getter
public class EmployeeBeanAdd {

    @EJB
    private EmployeeFacade employeeFacade;

    private int id;
    private String name;
    private double salary;

    public String add() {
        if (id != 0) {
            Employee newEmployee = Employee.builder().id(id).name(name).salary(salary).build();
            employeeFacade.addEmployee(newEmployee);
            return "employess";
        }
        return "employeesInvalid";
    }
}
