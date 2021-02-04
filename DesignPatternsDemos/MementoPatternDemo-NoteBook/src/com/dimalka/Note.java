package com.dimalka;

public class Note {
	
	private String title;
	private String discription;
	public Note(String title, String discription) {
		this.title = title;
		this.discription = discription;
	}
	@Override
	public String toString() {
		return "\nNote : title=" + title + ", discription=" + discription + "";
	}
	
	

}
