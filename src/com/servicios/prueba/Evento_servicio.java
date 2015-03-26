package com.servicios.prueba;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/eventos")
public class Evento_servicio {
	
	@Path("/get")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Evento[] getInboxJSON() {
				
		Evento evento1 = new Evento(0,"titulo 1", "body 1 subject1", "url 1 detaiasdfasdfl1", "1427304600000","1427401800000");
		Evento evento2 = new Evento(1,"titulo 2", "body 2subject2", "url 2 detaasdfasdfil2", "1427304600000","1427315400000");
		//Evento evento3 = new Evento(2,"titulo 3", "boody 3subject3", "url 3 detasdfasdfail3", "start 3 priority3","end");
		
		Evento[] mails = new Evento[2];
		mails[0] = evento1;
		mails[1] = evento2;
		//mails[2] = evento3;
 
		return mails;
 
	}
}
