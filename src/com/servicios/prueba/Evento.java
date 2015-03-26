package com.servicios.prueba;

public class Evento {
	int id;
	String title;
	String body;
	String url;
//	String class;
	String start;
	String end;
	
	//emplate ????
	
	public Evento(int id,String title, String body, String url,String start,String end)
	{
		this.id = id;
		this.title = title;
		this.body = body;
		this.url = url;
		this.start = start;
		this.end = end;
		
	}
	
	public int getId() {
		return id;
	}
 
	public void setId(int id) {
		this.id = id;
	}
	
	public String getTitle() {
		return title;
	}
 
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getBody() {
		return body;
	}
 
	public void setBody(String title) {
		this.body = title;
	}
	
	public String getUrl() {
		return url;
	}
 
	public void setUrl(String title) {
		this.url = title;
	}
	
	public String getStart() {
		return start;
	}
 
	public void setStart(String title) {
		this.start = title;
	}
	public String getEnd() {
		return end;
	}
 
	public void setEnd(String title) {
		this.end = title;
	}
	 
	@Override
	public String toString() {
		return "Mail [id="+id+", title=" + title + ", body=" + body + ", url="+ url +", start="+ start +", end="+ end +"]";
	}

}
