package jsf.model;

import ejb.BookingFacade;
import jpa.Booking;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

@ManagedBean(name = "bookingBean")
@SessionScoped
public class BookingBean implements Serializable {
    @EJB
    private BookingFacade bookingFacade;


    public String add(String date, int hours, int project_id, int team_id) {
        bookingFacade.bookNow(date, hours, project_id, team_id);
        return null;
    }

    public List<Booking> getBookingForEmployee() {
        return bookingFacade.getBookingByEmployee(getParam());
    }

    public int getParam() {
        FacesContext context = FacesContext.getCurrentInstance();
        Map<String, String> paramMap = context.getExternalContext().getRequestParameterMap();
        String projectId = paramMap.get("id");
        return Integer.parseInt(projectId);
    }
}
