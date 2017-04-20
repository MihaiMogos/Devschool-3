package ejb;

import jpa.Employee;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by Mihai MOGOS on 20/04/17.
 */
@Stateless
public class EmployeeFacadeImpl implements EmployeeFacade{

    @PersistenceContext(unitName = "helloWorldDS")
    private EntityManager entityManager;

    @Override
    public List<Employee> getEmployees() {
        //JPQL query
        Query query = entityManager.createQuery("SELECT e FROM Employee e");
        return (List<Employee>)query.getResultList();
    }
}
