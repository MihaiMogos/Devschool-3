package jaxrs.application;

import jaxrs.resource.EmployeeResource;
import jaxrs.resource.HelloResource;
import jpa.Employee;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Andrei on 28.04.2017.
 */
@ApplicationPath("/rest")
public class EmployeeRestApplication extends Application{


    @Override
    public Set<Class<?>> getClasses(){
        return new HashSet<>(Arrays.asList(HelloResource.class, EmployeeResource.class));
    }

}
