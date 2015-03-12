package com.servicios.prueba;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/mail")
public class mail_service {
	
	public String [] to = new String [4];
	public String [] cc = new String [4];
	public String [] bcc = new String [4];
	
	@Path("/get")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Mail[] getTrackInJSON() {
		
		to[0] = "pedro";
		to[1] = "jaime";
		to[2] = "juan";
		
		cc[0] = "pedro";
		cc[1] = "jaime";
		cc[2] = "juan";
		
		bcc[0] = "pedro";
		bcc[1] = "jaime";
		bcc[2] = "juan";
		
		Mail newMail1 = new Mail(0,"me1",to , cc, bcc, "subject1", "detail1", "priority1");
		Mail newMail2 = new Mail(1,"me2",to , cc, bcc, "subject2", "detail2", "priority2");
		Mail newMail3 = new Mail(2,"me3",to , cc, bcc, "subject3", "detail3", "priority3");
		
		Mail[] mails = new Mail[3];
		mails[0] = newMail1;
		mails[1] = newMail2;
		mails[2] = newMail3;
		
//		Track track = new Track();
//		track.setTitle("Enter Sandman");
//		track.setSinger("Metallica");
 
		return mails;
 
	}

}


