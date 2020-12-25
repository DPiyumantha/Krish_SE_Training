package com.virtusa;

import java.util.ArrayList;

public class NoteBookMemento {
	
	ArrayList<Note> notes = new ArrayList<>();

	public NoteBookMemento(ArrayList<Note> notes) {
		this.notes = notes;
	}
	
	public ArrayList<Note> getNotes() {
		return notes;
	}
	

}
