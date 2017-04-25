package ejb;

import jpa.Booking;

import java.util.List;

public interface BookingFacade {

    List<Booking> getBookingByEmployee(int employeeId);

    void bookNow(String date, int hours, int project_id, int team_id);
}
