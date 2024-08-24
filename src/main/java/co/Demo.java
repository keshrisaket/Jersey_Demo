package co;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path(value = "/demo")
public class Demo {

    @GET
    @Path(value = "/login")
    @Produces(MediaType.TEXT_HTML)
    public String login(){
        System.out.println("saket login");
        return "success method call";
    }
}
