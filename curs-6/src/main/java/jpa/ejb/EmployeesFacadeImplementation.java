package jpa.ejb;

import jpa.Employee;

import javax.ejb.Stateless;
import javax.persistence.Entity;
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
        return (List<Employee>)query.getResultList();
    }
}