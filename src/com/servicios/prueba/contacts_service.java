package com.servicios.prueba;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/contacts")
public class contacts_service {
	
	public String [] of = new String [4];
	public int [] numbers = new int [4];
	//public String [] bcc = new String [4];
	
	@Path("/get")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Contacts[] getTrackInJSON() {
		
		of[0] = "Jatun";
		of[1] = "Piramide";
		of[2] = "DH";
		
		
		
		numbers[0] = 591000;
		numbers[1] = 6590403;
		numbers[2] = 9699696;
		
		/*bcc[0] = "pedro";
		bcc[1] = "jaime";
		bcc[2] = "juan";*/
		
		
		Contacts Contact1 = new Contacts(0,"Ortega, Julien", of, "country", 591, "city", numbers);
		Contacts Contact2 = new Contacts(0,"Franco, Mauricio", of, "country", 591, "city", numbers);
		Contacts Contact3 = new Contacts(0,"Garcia, Ariel", of, "country", 591, "city", numbers);
		
		Contacts[] contacts = new Contacts[3];
		contacts[0] = Contact1;
		contacts[1] = Contact2;
		contacts[2] = Contact3;
		
//		Track track = new Track();
//		track.setTitle("Enter Sandman");
//		track.setSinger("Metallica");
 
		return contacts;
 
	}

}


