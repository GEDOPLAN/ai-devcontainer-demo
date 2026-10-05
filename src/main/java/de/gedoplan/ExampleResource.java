package de.gedoplan;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.NotFoundException;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        Hello hello = Hello.<Hello>findAll().firstResultOptional()
                .orElseThrow(NotFoundException::new);
        return hello.message;
    }
}
