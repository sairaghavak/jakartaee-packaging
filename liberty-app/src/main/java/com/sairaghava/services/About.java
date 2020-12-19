package com.sairaghava.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * @author: sairaghava.com
 */
@Path("/")
public class About {

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public Response defaultPath() {
    return Response.ok("A quick thorntail-app packaging demo").build();
  }

  @Path("/about")
  @Produces(MediaType.TEXT_PLAIN)
  @GET
  public Response getAbout() {
    return Response.ok("'SaiRaghava K' says hello to you").build();
  }
}
