package com.cisco.encapsulation;

import java.io.Serializable;

public class Student implements Serializable
{
	private int id;
	private String name;
	private int std;
	private int division;
	private String mobile;
	
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public int getStd() 
	{
		return std;
	}
	public void setStd(int std) 
	{
		this.std = std;
	}
	public int getDivision() 
	{
		return division;
	}
	public void setDivision(int division) 
	{
		this.division = division;
	}
	public String getMobile() 
	{
		return mobile;
	}
	public void setMobile(String mobile) 
	{
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", std=" + std + ", division=" + division + ", mobile=" + mobile
				+ "]";
	}
	
	
	
	
}
