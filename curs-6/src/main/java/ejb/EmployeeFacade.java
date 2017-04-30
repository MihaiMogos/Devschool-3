package ejb;

import jpa.Employee;

import javax.ejb.Local;
import java.util.List;

@Local
public interface EmployeeFacade {
    List<Employee> getEmployees();

    void addEmployee(Employee employee);
}
