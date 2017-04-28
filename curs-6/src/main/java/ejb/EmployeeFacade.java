package ejb;

import jpa.Employee;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by Mihai MOGOS on 20/04/17.
 */
@Local
public interface EmployeeFacade {
    List<Employee> getEmployees();
    void addEmployee(Employee employee);
}
