package ca.viu.csci331.assignment1.model;

public class Student {
	
	private String name;
	private String id;
	private double gpa;
	
	public Student(String name, String id, double gpa) {
		this.name = name;
		this.id = id;
		this.gpa = gpa;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public double getGpa() {
		return gpa;
	}
	
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public void show() {
		System.out.println("NAME: " + name + ", ID: " + id + ", GPA: " + gpa);
	}

}
