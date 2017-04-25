package ejb;

import jpa.Booking;
import jpa.Employee;
import jpa.Project;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class BookingFacadeImplementation implements BookingFacade {

    @PersistenceContext(unitName = "timesheetsDS")
    private EntityManager entityManager;

    @Override
    public List<Booking> getBookingByEmployee(int employeeId) {
        Query query = entityManager.createQuery("SELECT e FROM Booking e WHERE e.employee.id = :employeeId");
        query = query.setParameter("employeeId", employeeId);
        return (List<Booking>) query.getResultList();
    }

    @Override
    public void bookNow(String date, int hours, int project_id, int team_id) {
        Booking book = Booking.builder().date(date).hours(hours).project(Project.builder().id(project_id).build())
                .employee(Employee.builder().id(team_id).build()).build();
        entityManager.persist(book);
    }
}
