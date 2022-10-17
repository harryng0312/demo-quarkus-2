package org.harryng.demo;

import org.harryng.demo.config.SystemConfig;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class ExampleResource {

    @Inject
    protected GreetingConfig greetingConfig;

    @Inject
    protected SystemConfig systemConfig;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello from RESTEasy Reactive "
                + greetingConfig.message() + " "
                + systemConfig.getAddressPort();
    }
}