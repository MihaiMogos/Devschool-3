package jsf.model.employee;

import ejb.EmployeeFacade;
import jpa.Employee;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.faces.bean.RequestScoped;

/**
 * Created by Andrei on 28.04.2017.
 */

@javax.faces.bean.ManagedBean(name="employeeBeanAdd")
@RequestScoped
@Getter
@Setter
public class EmployeeBeanAdd {
    @EJB
    private EmployeeFacade employeeFacade;

    private int id;
    private String name;
    private double salary;

    public String add(){
        if(id!=0){
            Employee newEmployee=Employee.builder().id(id).name(name).salary(salary).build();
            employeeFacade.addEmployee(new Employee());
            return "employees";

        }else{
            return "employeeInvalid";
        }
    }

}
