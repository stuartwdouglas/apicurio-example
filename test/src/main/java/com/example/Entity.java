package com.example;

import java.lang.Object;
import java.lang.String;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/entity")
public interface Entity {
  @Path("/{id}")
  @GET
  String generatedMethod1(@PathParam("id") Object id);
}
