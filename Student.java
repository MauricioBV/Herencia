package com.pp2;

public class Student extends Person {
private String nameOFUniversity;

	public Student(int age, String name, String nameOFUniversity) {
		super(age,name);
		this.nameOFUniversity = nameOFUniversity;
	}
	
	public void showStudent() {
		System.out.println("Student name:" + name);
		System.out.println("Age:" + age);
		System.out.println("University:" + nameOFUniversity);
	}
	
	public void showAge() {
		super.showAge();
	}

}
