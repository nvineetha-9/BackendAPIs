package com.example.doctors.model;

public class Appoinment {
	
	private int docid;
	private String pat;
	public Appoinment(int docid, String pat) {
		super();
		this.docid = docid;
		this.pat = pat;
	}
	public Appoinment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDoc() {
		return docid;
	}
	public void setDoc(int docid) {
		this.docid = docid;
	}
	public String getPat() {
		return pat;
	}
	public void setPat(String pat) {
		this.pat = pat;
	}
	@Override
	public String toString() {
		return "Appoinment [doc=" + docid + ", pat=" + pat + "]";
	}
	
	
	

}
