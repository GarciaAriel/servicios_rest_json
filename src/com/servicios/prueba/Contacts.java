package com.servicios.prueba;

public class Contacts {
	int Id;
	String name;
	
	String [] of;
	String country;
	int zip;
//	String  To;
//	String  Cc;
//	String  Bcc;
	String city;
	int [] numbers;
	String foto;
	String type;
	
	/*"https://pbs.twimg.com/profile_images/491274378181488640/Tti0fFVJ.jpeg"*/
 
	//emplate ????
	
	public Contacts(int id,String name, String [] of, String country,int zip,String city, int [] numbers,String foto,String type)
	{
		this.Id = id;
		this.name = name;
		this.of = of;
		this.country = country;
		this.zip = zip;
		this.city = city;
		this.numbers = numbers;
		this.foto = foto;
		this.type = type;
		
	}
	
	public int getId() {
		return Id;
	}
 
	public void setId(int title) {
		this.Id = title;
	}
	
	public String getFoto() {
		return foto;
	}
 
	public void setFoto(String title) {
		this.foto = title;
	}
	
	public String getname() {
		return name;
	}
 
	public void setname(String title) {
		this.name = title;
	}
	
	public String[] getof() {
		return of;
	}
 
	public void setof(String[] title) {
		this.of = title;
	}
	public String getcountry() {
		return country;
	}
 
	public void setcountry(String title) {
		this.country = title;
	}
	public int getzip() {
		return zip;
	}
	public void setzip(int title) {
		this.zip = title;
	}
 
	public void setcity(String title) {
		this.city = title;
	}
	public String getcity() {
		return city;
	}
	public void setnumbers(int[] title) {
		this.numbers = title;
	}
	public int[] getnumbers() {
		return numbers;
	}
	
	public void settype(String title) {
		this.type = title;
	}
	public String getType() {
		return type;
	}
 
	/*public void setPriority(String title) {
		this.Priority = title;
	}
	public String getPriority() {
		return Priority;
	}*/
		
 
	@Override
	public String toString() {
		return "Contacts [Id="+Id+", name=" + name + ", of=" + of + ", country="+ country +", zip="+zip+", city="+ city +", numbers="+numbers+", foto="+foto+", type="+type+"]";
	}
 
}