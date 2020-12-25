package com.virtusa;

import java.util.Stack;

public class CareTaker {
	
	Stack<NoteBookMemento> noteBookStates = new Stack<>();
	
	
	public void save(NoteBook noteBook) {
		noteBookStates.push(noteBook.save());
	}
	
	public void revert(NoteBook noteBook) {
		if(noteBookStates.isEmpty()) {
			System.out.println("You are on the last save point");
		}else {
			noteBook.revert(noteBookStates.pop());
		}
	}

}
