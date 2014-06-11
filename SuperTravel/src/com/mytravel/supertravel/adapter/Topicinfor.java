package com.mytravel.supertravel.adapter;

public class Topicinfor {
	
	private String UserName;
	private String time;
	private String address;
	private String text;
	private String imagepath;
	boolean isimage;
	
	
	public Topicinfor(String name,String time,String addr,String text,String image,boolean isimage)
	{
		this.UserName=name;
		this.time=time;
		this.address=addr;
		this.text=text;
		this.imagepath=image;
		this.isimage=isimage;
	}
	
	public boolean getisimage()
	{
		return this.isimage;
	}
	public String getname()
	{
		return this.UserName;
	}
	public String gettime()
	{
		return this.time;
	}
	public String gettext()
	{
		return this.text;
	}
	public String getaddr()
	{
		return this.address;
	}
	public String getimage()
	{
		return this.imagepath;
	}
	

}
