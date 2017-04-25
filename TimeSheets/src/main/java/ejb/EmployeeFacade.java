package ejb;

import jpa.Employee;

import java.util.List;

public interface EmployeeFacade {
    List<Employee> getAllEmployeesForCorrespondentProject(int projectId);

    Employee getEmployeeById(int employeeId);
}
