package com.servicios.prueba;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/v1")
public class Primer_servicio {
	@Path("/status")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnTitle()
	{
		return "<P>hola pedro<P>";
	}
	
	@Path("/version")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String returnOto()
	{
		return "<P>version<P>";
	}
	
	@Path("/get")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Track getTrackInJSON() {
 
		Track track = new Track();
		track.setTitle("Enter Sandman");
		track.setSinger("Metallica");
 
		return track;
 
	}
	
}
