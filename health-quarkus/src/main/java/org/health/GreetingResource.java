package org.health;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.logging.Logger;


@Path("/hello-resteasy")
public class GreetingResource {
public static final Logger LOGGER=Logger.getLogger(GreetingResource.class.getSimpleName());
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
    	
    	LOGGER.info("Hello");
        return "Hello RESTEasy";
    }
}