package com.virtusa;

import java.util.ArrayList;

public class NoteBook {
	ArrayList<Note> notes = new ArrayList<>();
	
	public void addNote(String title, String discription) {
		notes.add(new Note(title, discription));
	}
	
	public ArrayList<Note> getNotes(){
		return (ArrayList<Note>)this.notes.clone();
	}
	
	public NoteBookMemento save() {
		return new NoteBookMemento(getNotes());
	}
	
	public void revert(NoteBookMemento noteBookMemento) {
		this.setNotes(noteBookMemento.getNotes());
	}

	public void setNotes(ArrayList<Note> notes) {
		this.notes = notes;
	}

	@Override
	public String toString() {
		return "NoteBook :" + notes + "";
	}
	

}
