package jaxrs.resource;

import ejb.EmployeeFacade;
import jpa.Employee;

import javax.ejb.EJB;
import javax.ws.rs.*;
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

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    @Path("addEmployee")
    public Response add(Employee newEmployee) {
        employeeFacade.addEmployee(newEmployee);
        return Response.ok(newEmployee).build();
    }

    @DELETE
    @Produces({MediaType.APPLICATION_JSON})
    @Path("deleteEmployee/{id}")
    public Response delete(@PathParam("id") int id) {
        Employee newEmployee = Employee.builder().id(id).build();
        employeeFacade.deleteEmployee(newEmployee);
        return Response.ok(newEmployee).build();
    }

}
