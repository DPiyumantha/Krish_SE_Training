package com.dimalka;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		Registry registry = new Registry();

		try {
			Trainer trainer = (Trainer) registry.getPerson(Role.TRAINER);
			trainer.setName("Krishantha");
			trainer.setTotalTrainedBatches(10);
			System.out.println("==================================================");
			System.out.println("Trainer Details");
			System.out.println("--------------------------------------------------");
			System.out.println(trainer);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		try {
			ArrayList<Person> studentList = registry.getStudentList();
			System.out.println("==================================================");
			System.out.println("Students Details");
			System.out.println("--------------------------------------------------");
			System.out.println(studentList);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			System.err.println("Please check the file path");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
