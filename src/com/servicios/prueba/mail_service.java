package com.servicios.prueba;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/mailboxes")
public class mail_service {
	
	public String [] to = new String [2];
	public String [] cc = new String [3];
	public String [] bcc = new String [1];
	
	@Path("/idUser")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Mail[] getInboxJSON() {
		
		
		to[0] = "pedro@pedro.com";
		to[1] = "jaime@jaime.com";
		
		cc[0] = "pedro@pedro.com";
		cc[1] = "jaime@jaime.com";
		cc[2] = "juan@juan.com";
		
		bcc[0] = "pedro@pedro.com";
		String detalleee = "<table style='width:100%'>  <tr>  <td>Jill</td>   <td>Smith</td>   <td>50</td> </tr> <tr>  <td>Eve</td>   <td>Jackson</td>    <td>94</td> </tr>  <tr>    <td>John</td>    <td>Doe</td>	    <td>80</td>  </tr></table>";
		
		Mail newMail1 = new Mail(0,"inbox@inbox.com",to , cc, bcc, "subject1", detalleee, "priority1","inbox","false");
		Mail newMail2 = new Mail(1,"inbox@inbox.com",bcc , to, cc, "subject2", "detail2asdfasdf", "priority2","inbox","true");
		Mail newMail3 = new Mail(2,"inbox@inbox.com",cc , bcc, cc, "subject3", "detaasdfasdfil3", "priority3","inbox","true");
		
		Mail newMail11 = new Mail(0,"sentItems@sentItems.com",to , cc, bcc, "subject1", "detaiasdfasdfl1", "priority1","sentItems","false");
		Mail newMail12 = new Mail(1,"sentItems@sentItems.com",to , cc, bcc, "subject2", "detaiasdfasdfl2", "priority2","sentItems","false");
		Mail newMail13 = new Mail(2,"sentItems@sentItems.com",to , cc, bcc, "subject3", "detaasdfasdfil3", "priority3","sentItems","true");
		
		Mail newMail21 = new Mail(0,"draftItems@draftItems.com",to , cc, bcc, "subject1", "detaasdfasdfil1", "priority1","draftItems","true");
		Mail newMail22 = new Mail(1,"draftItems@draftItems.com",to , cc, bcc, "subject2", "detaiasdfasdfl2", "priority2","draftItems","true");
		Mail newMail23 = new Mail(2,"draftItems@draftItems.com",to , cc, bcc, "subject3", "detaiasdfasdfl3", "priority3","draftItems","true");
		
		Mail newMail31 = new Mail(0,"trashItems@trashItems.com",to , cc, bcc, "subject1", "detaasdfasdfil1", "priority1","trashItems","false");
		Mail newMail32 = new Mail(1,"trashItems@trashItems.com",to , cc, bcc, "subject2", "detasdfasdfail2", "priority2","trashItems","false");
		Mail newMail33 = new Mail(2,"trashItems@trashItems.com",to , cc, bcc, "subject3", "detaasdfasdfil3", "priority3","trashItems","false");
		
		Mail newMail41 = new Mail(0,"outBoxItems@outBoxItems.com",to , cc, bcc, "subject1", "detasdfasdfail1", "priority1","outBoxItems","false");
		Mail newMail42 = new Mail(1,"outBoxItems@outBoxItems.com",to , cc, bcc, "subject2", "detasdfasdfail2", "priority2","outBoxItems","true");
		Mail newMail43 = new Mail(2,"outBoxItems@outBoxItems.com",to , cc, bcc, "subject3", "detasdfasdfail3", "priority3","outBoxItems","true");
		
		Mail newMail51 = new Mail(0,"oto@inbox.com",to , cc, bcc, "subject1", "detasdfasdfail1", "priority1","oto","false");
		Mail newMail52 = new Mail(1,"oto@inbox.com",bcc , to, cc, "subject2", "detasdfasdfail2", "priority2","oto","true");
		Mail newMail53 = new Mail(2,"oto@inbox.com",cc , bcc, cc, "subject3", "detaiasdfasdfl3", "priority3","oto","true");
		
		Mail newMail61 = new Mail(0,"pepe@inbox.com",to , cc, bcc, "subject1", "detaiasdfasdfl1", "priority1","pepe","false");
		Mail newMail62 = new Mail(1,"pepe@inbox.com",bcc , to, cc, "subject2", "detaasdfasdfil2", "priority2","pepe","true");
		Mail newMail63 = new Mail(2,"pepe@inbox.com",cc , bcc, cc, "subject3", "detasdfasdfail3", "priority3","pepe","true");
		
		Mail[] mails = new Mail[21];
		mails[0] = newMail1;
		mails[1] = newMail2;
		mails[2] = newMail3;
		
		mails[3] = newMail11;
		mails[4] = newMail12;
		mails[5] = newMail13;
		
		mails[6] = newMail21;
		mails[7] = newMail22;
		mails[8] = newMail23;
		
		mails[9] = newMail31;
		mails[10] = newMail32;
		mails[11] = newMail33;
		
		mails[12] = newMail41;
		mails[13] = newMail42;
		mails[14] = newMail43;
		
		mails[15] = newMail51;
		mails[16] = newMail52;
		mails[17] = newMail53;
		
		mails[18] = newMail61;
		mails[19] = newMail62;
		mails[20] = newMail63;
 
		return mails;
 
	}
	

}


