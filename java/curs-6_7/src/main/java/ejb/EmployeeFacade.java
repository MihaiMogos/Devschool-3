package ejb;

import jpa.Employee;

import javax.ejb.Local;
import java.util.List;

/**
 * Created by Andrei on 20.04.2017.
 */
@Local
public interface EmployeeFacade {

    List<Employee> getEmployees();

    void addEmployee(Employee employee);


}
