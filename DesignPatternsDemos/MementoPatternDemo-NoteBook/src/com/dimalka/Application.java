package com.dimalka;

public class Application {

	public static void main(String[] args) {
		NoteBook noteBook = new NoteBook();
		CareTaker careTaker = new CareTaker();
		
		noteBook.addNote("First Note", "This is the description for  first note");
		careTaker.save(noteBook);
		System.out.println(noteBook);
		
		noteBook.addNote("Second Note", "This is the description for  Second note");
		careTaker.save(noteBook);
		System.out.println(noteBook);
		
		noteBook.addNote("Third Note", "This is the description for  Third note");
		careTaker.save(noteBook);
		System.out.println(noteBook);
		System.out.println("=========================  Undo..");
		careTaker.revert(noteBook);
		careTaker.revert(noteBook);
		System.out.println(noteBook);
		
		noteBook.addNote("Fourth Note", "This is the description for  Fourth note");
		careTaker.save(noteBook);
		System.out.println(noteBook);
		
		noteBook.addNote("Third Fifth", "This is the description for  Fifth note");
		careTaker.save(noteBook);
		System.out.println(noteBook);

	}

}
