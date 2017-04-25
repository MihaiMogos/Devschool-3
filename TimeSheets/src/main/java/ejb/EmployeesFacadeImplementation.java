package ejb;

import jpa.Employee;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class EmployeesFacadeImplementation implements EmployeeFacade {

    @PersistenceContext(unitName = "timesheetsDS")
    private EntityManager entityManager;

    @Override
    public List<Employee> getAllEmployeesForCorrespondentProject(int projectId) {
        Query query = entityManager.createQuery("SELECT e FROM Employee e WHERE e.project.id = :projectId");
        query = query.setParameter("projectId", projectId);
        return (List<Employee>) query.getResultList();
    }

    @Override
    public Employee getEmployeeById(int employeeId) {
        Query query = entityManager.createQuery("SELECT e FROM Employee e WHERE e.id = :employeeId");
        query = query.setParameter("employeeId", employeeId);
        return (Employee) query.getSingleResult();
    }
}
