package com.softserve.tasks;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
	int currentYear = Calendar.getInstance().get(Calendar.YEAR);

	Person person1 = new Person();

	person1.input("Ivan", 2002);
	person1.output(currentYear);

	Person person2 = new Person();
	person2.setName("Petro");
	person2.setBirthYear(2008);
	person2.changeName("Max");
	System.out.println(person2.getName());
	System.out.println(person2.getBirthYear());

	Person person3 = new Person();
	person3.input("Michael", 2000);
	System.out.printf("%s is %d years old\n", person3.getName(),person3.age(currentYear));
	person3.output(currentYear);

	Person person4 = new Person();
	person4.input("Bodya", 1998);
	person4.output(currentYear);

	Person person5 = new Person();
	person5.input("Andriy", 2010);
	person5.output(currentYear);








    }


}
