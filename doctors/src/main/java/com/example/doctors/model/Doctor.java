package com.example.doctors.model;

import java.util.List;

public class Doctor {
	
	private int id;
	private String name;
	private String specialist;
	private int visitors;
	
	public Doctor(int id, String name, String specialist, int visitors) {
		super();
		this.id = id;
		this.name = name;
		this.specialist = specialist;
		this.visitors = visitors;
	}

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecialist() {
		return specialist;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public int getVisitors() {
		return visitors;
	}

	public void setVisitors(int visitors) {
		this.visitors = visitors;
	}

	

	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", specialist=" + specialist + ", visitors=" + visitors
				+ ", patient=" +  "]";
	}
	
	
	

}
