package se.idioti.example.jaxrs.rest.server;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/song")
public class KaraokeService {
	
	@GET
	@Path("/{param}")
    @Produces(MediaType.TEXT_PLAIN)
	public Response getSong(@PathParam("param") String song) {
 
		String output = "Let's all sing along! You'll sing: " + song;
 
		return Response.status(200).entity(output).build();
 
	}
}
