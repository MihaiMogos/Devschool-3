package jaxrs.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by Andrei on 28.04.2017.
 */
@Path("helloworld")
public class HelloResource {
    @GET
    @Produces("text/plain")
    public String getHello(){ return "hello jax-rs";}
}
