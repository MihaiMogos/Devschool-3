package ejb;

import jpa.Employee;

import javax.ejb.Stateless;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Andrei on 20.04.2017.
 */

@Stateless
public class EmployeeFacadeImpl implements EmployeeFacade {


    @PersistenceContext(unitName = "helloWorldDS")
    private EntityManager entityManager;


    @Override
    public List<Employee> getEmployees() {
        //JPQLnguery
        Query query=entityManager.createQuery("SELECT e FROM employee e");
        return (List<Employee>) query.getResultList();

    }

    @Override
    public void addEmployee(Employee employee) {
        entityManager.persist(employee);
    }
}
