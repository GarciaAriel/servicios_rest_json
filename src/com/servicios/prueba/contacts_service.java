package com.servicios.prueba;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/contacts")
public class contacts_service {
	
	public String [] of = new String [4];
	public int [] numbers = new int [4];
	
	public String foto1;
	public String foto2;
	public String foto3;
	
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
		foto1 ="http://www.mobygames.com/images/i/26/09/650109.png";
		foto2 ="https://pbs.twimg.com/profile_images/479090794058379264/84TKj_qa.jpeg";
		foto3 ="https://pbs.twimg.com/profile_images/491274378181488640/Tti0fFVJ.jpeg";
//		fotos[1]="https://pbs.twimg.com/profile_images/491274378181488640/Tti0fFVJ.jpeg";
//		fotos[2]="https://pbs.twimg.com/profile_images/479090794058379264/84TKj_qa.jpeg";
//		fotos[3]="https://pbs.twimg.com/profile_images/491995398135767040/ie2Z_V6e.jpeg";
//		fotos[4]="https://pbs.twimg.com/profile_images/514549811765211136/9SgAuHeY.png";
//		fotos[5]="https://pbs.twimg.com/profile_images/491274378181488640/Tti0fFVJ.jpeg";
//		fotos[6]="https://pbs.twimg.com/profile_images/479090794058379264/84TKj_qa.jpeg";
		
		
		
		Contacts Contact1 = new Contacts(0,"Electronic Arts", of, "Francia", 000, "city", numbers,foto1,"company");
		Contacts Contact2 = new Contacts(1,"Ortega, Julien", of, "Bolivia", 591, "Cbba", numbers,foto2,"person");
		Contacts Contact3 = new Contacts(2,"Franco, Mauricio", of, "Boliva", 591, "cbba", numbers,foto3,"secret");

		Contacts Contact4 = new Contacts(3,"Ortega, Julien", of, "Francia", 000, "city", numbers,foto2,"person");
		Contacts Contact5 = new Contacts(4,"Electronic Arts", of, "Bolivia", 591, "Cbba", numbers,foto1,"company");
		Contacts Contact6 = new Contacts(5,"Franco, Mauricio", of, "Boliva", 591, "cbba", numbers,foto3,"secret");
		
		Contacts[] contacts = new Contacts[6];
		contacts[0] = Contact1;
		contacts[1] = Contact2;
		contacts[2] = Contact3;
		contacts[3] = Contact4;
		contacts[4] = Contact5;
		contacts[5] = Contact6;
		
//		Track track = new Track();
//		track.setTitle("Enter Sandman");
//		track.setSinger("Metallica");
 
		return contacts;
 
	}

}


