package com.servicios.prueba;

public class Mail {
	int Id;
	String From;
	String [] To;
	String [] Cc;
	String [] Bcc;
//	String  To;
//	String  Cc;
//	String  Bcc;
	String Subject;
	String Detail;
	String Priority;
	String Foto = "https://pbs.twimg.com/profile_images/491274378181488640/Tti0fFVJ.jpeg";
	String folder;
	String see;
 
	//emplate ????
	
	public Mail(int id,String from, String [] to, String[]  cc,String[]  bcc,String subject,String detail,String priority,String folder,String see)
	{
		this.see = see;
		this.Id = id;
		this.From = from;
		this.To = to;
		this.Cc = cc;
		this.Bcc = bcc;
		this.Subject = subject;
		this.Detail = detail;
		this.Priority = priority;
		this.folder=folder;
	}
	
	public String getSee() {
		return see;
	}
 
	public void setSee(String title) {
		this.see = title;
	}
	
	public String getFolder() {
		return folder;
	}
 
	public void setFolder(String title) {
		this.folder = title;
	}
	
	public int getId() {
		return Id;
	}
 
	public void setId(int title) {
		this.Id = title;
	}
	
	public String getFoto() {
		return Foto;
	}
 
	public void setFoto(String title) {
		this.Foto = title;
	}
	
	public String getFrom() {
		return From;
	}
 
	public void setFrom(String title) {
		this.From = title;
	}
	
	public String[] getTo() {
		return To;
	}
 
	public void setTo(String[] title) {
		this.To = title;
	}
	public String[] getCc() {
		return Cc;
	}
 
	public void setCc(String[] title) {
		this.Cc = title;
	}
	public String[] getBcc() {
		return Bcc;
	}
	public void setBcc(String[] title) {
		this.Bcc = title;
	}
 
	public void setSubject(String title) {
		this.Subject = title;
	}
	public String getSubject() {
		return Subject;
	}
	public void setDetail(String title) {
		this.Detail = title;
	}
	public String getDetail() {
		return Detail;
	}
 
	public void setPriority(String title) {
		this.Priority = title;
	}
	public String getPriority() {
		return Priority;
	}
		
 
	@Override
	public String toString() {
		return "Mail [Id="+Id+", From=" + From + ", To=" + To + ", Cc="+ Cc +", Bcc="+Bcc+", Subject="+ Subject +", Details="+Detail+", Priority="+Priority+", Foto="+Foto+"]";
	}
 
}