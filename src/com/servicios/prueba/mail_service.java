package com.servicios.prueba;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/mailboxes")
public class mail_service {
	
	public String [] to = new String [3];
	public String [] cc = new String [3];
	public String [] bcc = new String [3];
	
	@Path("/inbox")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Mail[] getInboxJSON() {
		
		
		to[0] = "pedro@pedro.com";
		
		cc[0] = "pedro@pedro.com";
		cc[1] = "jaime@jaime.com";
		cc[2] = "juan@juan.com";
		
		bcc[0] = "pedro@pedro.com";
		
		Mail newMail1 = new Mail(0,"inbox@inbox.com",to , cc, bcc, "subject1", "detail1", "priority1","inbox");
		Mail newMail2 = new Mail(1,"inbox@inbox.com",bcc , to, cc, "subject2", "detail2", "priority2","inbox");
		Mail newMail3 = new Mail(2,"inbox@inbox.com",cc , bcc, cc, "subject3", "detail3", "priority3","inbox");
		
		Mail[] mails = new Mail[3];
		mails[0] = newMail1;
		mails[1] = newMail2;
		mails[2] = newMail3;
 
		return mails;
 
	}
	
	@Path("/sentItems")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Mail[] getSentJSON() {
		
		to[0] = "pedro@pedro.com";
		to[1] = "jaime@jaime.com";
		to[2] = "juan@juan.com";
		
		cc[0] = "pedro@pedro.com";
		cc[1] = "jaime@jaime.com";
		cc[2] = "juan@juan.com";
		
		bcc[0] = "pedro@pedro.com";
		bcc[1] = "jaime@jaime.com";
		bcc[2] = "juan@juan.com";
		
		Mail newMail1 = new Mail(0,"sentItems@sentItems.com",to , cc, bcc, "subject1", "detail1", "priority1","sentItems");
		Mail newMail2 = new Mail(1,"sentItems@sentItems.com",to , cc, bcc, "subject2", "detail2", "priority2","sentItems");
		Mail newMail3 = new Mail(2,"sentItems@sentItems.com",to , cc, bcc, "subject3", "detail3", "priority3","sentItems");
		
		Mail[] mails = new Mail[3];
		mails[0] = newMail1;
		mails[1] = newMail2;
		mails[2] = newMail3;
 
		return mails;
 
	}
	@Path("/draftItems")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Mail[] getDraftJSON() {
		
		to[0] = "pedro@pedro.com";
		to[1] = "jaime@jaime.com";
		to[2] = "juan@juan.com";
		
		cc[0] = "pedro@pedro.com";
		cc[1] = "jaime@jaime.com";
		cc[2] = "juan@juan.com";
		
		bcc[0] = "pedro@pedro.com";
		bcc[1] = "jaime@jaime.com";
		bcc[2] = "juan@juan.com";
		
		Mail newMail1 = new Mail(0,"draftItems@draftItems.com",to , cc, bcc, "subject1", "detail1", "priority1","draftItems");
		Mail newMail2 = new Mail(1,"draftItems@draftItems.com",to , cc, bcc, "subject2", "detail2", "priority2","draftItems");
		Mail newMail3 = new Mail(2,"draftItems@draftItems.com",to , cc, bcc, "subject3", "detail3", "priority3","draftItems");
		
		Mail[] mails = new Mail[3];
		mails[0] = newMail1;
		mails[1] = newMail2;
		mails[2] = newMail3;
 
		return mails;
 
	}
	@Path("/trashItems")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Mail[] getTrashJSON() {
		
		to[0] = "pedro@pedro.com";
		to[1] = "jaime@jaime.com";
		to[2] = "juan@juan.com";
		
		cc[0] = "pedro@pedro.com";
		cc[1] = "jaime@jaime.com";
		cc[2] = "juan@juan.com";
		
		bcc[0] = "pedro@pedro.com";
		bcc[1] = "jaime@jaime.com";
		bcc[2] = "juan@juan.com";
		
		Mail newMail1 = new Mail(0,"trashItems@trashItems.com",to , cc, bcc, "subject1", "detail1", "priority1","trashItems");
		Mail newMail2 = new Mail(1,"trashItems@trashItems.com",to , cc, bcc, "subject2", "detail2", "priority2","trashItems");
		Mail newMail3 = new Mail(2,"trashItems@trashItems.com",to , cc, bcc, "subject3", "detail3", "priority3","trashItems");
		
		Mail[] mails = new Mail[3];
		mails[0] = newMail1;
		mails[1] = newMail2;
		mails[2] = newMail3;
 
		return mails;
 
	}
	@Path("/outBoxItems")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Mail[] getOutBoxJSON() {
		
		to[0] = "pedro@pedro.com";
		to[1] = "jaime@jaime.com";
		to[2] = "juan@juan.com";
		
		cc[0] = "pedro@pedro.com";
		cc[1] = "jaime@jaime.com";
		cc[2] = "juan@juan.com";
		
		bcc[0] = "pedro@pedro.com";
		bcc[1] = "jaime@jaime.com";
		bcc[2] = "juan@juan.com";
		
		Mail newMail1 = new Mail(0,"outBoxItems@outBoxItems.com",to , cc, bcc, "subject1", "detail1", "priority1","outBoxItems");
		Mail newMail2 = new Mail(1,"outBoxItems@outBoxItems.com",to , cc, bcc, "subject2", "detail2", "priority2","outBoxItems");
		Mail newMail3 = new Mail(2,"outBoxItems@outBoxItems.com",to , cc, bcc, "subject3", "detail3", "priority3","outBoxItems");
		
		Mail[] mails = new Mail[3];
		mails[0] = newMail1;
		mails[1] = newMail2;
		mails[2] = newMail3;

		return mails;
 
	}


}


