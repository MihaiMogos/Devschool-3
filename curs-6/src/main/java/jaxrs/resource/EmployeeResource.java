package jaxrs.resource;

import ejb.EmployeeFacade;
import jpa.Employee;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/")
public class EmployeeResource {

    @EJB
    EmployeeFacade employeeFacade;

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("getAll")
    public Response getAll() {
        List<Employee> employees = employeeFacade.getEmployees();
        return Response.ok(employees).build();
    }

}
