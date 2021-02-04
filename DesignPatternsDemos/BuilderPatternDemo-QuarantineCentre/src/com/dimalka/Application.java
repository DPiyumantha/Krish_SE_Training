package com.dimalka;

public class Application {

	public static void main(String[] args) {
		QuarantinedPerson.Builder shortTermQuarantine = new QuarantinedPerson.Builder(10);
		QuarantinedPerson.Builder mediumTermQuarantine = new QuarantinedPerson.Builder( 14);
		QuarantinedPerson.Builder fullTermQuarantine = new QuarantinedPerson.Builder(21);
		
		QuarantinedPerson person1 = shortTermQuarantine.name("Saman").nicNumber("5686164V").specialCareNeeded(true).build();
		QuarantinedPerson person2 = mediumTermQuarantine.name("Anil").nicNumber("32475V").build();
		
		//Set country and passport number because j=he is a foreigner
		QuarantinedPerson person3 = fullTermQuarantine.name("Jamie").country("Ireland").passportNumber("568616443543").specialCareNeeded(true).build();
		
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
	}

}
