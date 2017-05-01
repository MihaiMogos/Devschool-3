package ejb;

import jpa.Employee;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class EmployeesFacadeImplementation implements EmployeeFacade {

    @PersistenceContext(unitName = "helloWorldDS")
    private EntityManager entityManager;

    @Override
    public List<Employee> getEmployees() {
        Query query = entityManager.createQuery("SELECT e FROM Employee e");
        return (List<Employee>) query.getResultList();
    }

    @Override
    public void addEmployee(Employee employee) {
        entityManager.persist(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        Employee bundle = entityManager.merge(employee);
        entityManager.remove(bundle);
    }
}
