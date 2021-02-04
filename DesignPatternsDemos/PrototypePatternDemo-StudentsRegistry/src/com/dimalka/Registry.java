package com.dimalka;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Registry {
	private Map<Role, Person> registry = new HashMap<>();

	public Registry() {
		this.initialize();
	}

	private void initialize() {

		Trainer trainer = new Trainer();
		Student student = new Student();
		registry.put(Role.TRAINER, trainer);
		registry.put(Role.STUDENT, student);

	}

	public Person getPerson(Role role) throws CloneNotSupportedException {
		Person person;
		person = (Person) registry.get(role).clone();
		return person;
	}

	public ArrayList<Person> getStudentList() throws FileNotFoundException, IOException, CloneNotSupportedException {
		ArrayList<Person> studentList = new ArrayList<>();
		String string;
		String path = "./src/com/dimalka/students.txt";
		FileReader fileReader = new FileReader(path);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		while ((string = bufferedReader.readLine()) != null) {
			Student student = (Student) getPerson(Role.STUDENT);
			student.setName(string.split(" ")[0]);
			student.setAssignmentStatus(string.split(" ")[1]);
			studentList.add(student);
		}

		if (fileReader != null) {
			fileReader.close();
		}
		if (bufferedReader != null) {
			bufferedReader.close();
		}

		return studentList;
	}

}
