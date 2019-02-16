package ca.viu.csci331.assignment1;

import java.util.Scanner;

import ca.viu.csci331.assignment1.model.Student;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of students that this application will process: ");
		int capacity = scanner.nextInt();
		ProcessStudents processStudents = new ProcessStudents(capacity);
		for(int i=0; i<capacity; i++) {
			System.out.println("Enter name for "+ i+ "th student: ");
			String name = scanner.next();
			System.out.println("Enter id for "+ i+ "th student: ");
			String id = scanner.next();
			System.out.println("Enter gpa for "+ i+ "th student: ");
			double gpa = scanner.nextDouble();
			processStudents.addStudent(new Student(name, id, gpa));
		}
		
		System.out.println("You have entered following students into the application");
		processStudents.showStudents();
		System.out.println("Enter the name of the student that you are looking for: ");
		String searchName = scanner.next();
		Student foundByName = processStudents.searchByName(searchName);
		if(foundByName!=null) {
			foundByName.show();
		}
		else {
			System.out.println("Therse is no student with name: " + searchName);
		}
		
		System.out.println("Enter the id of the student that you are looking for: ");
		String searchId = scanner.next();
		Student foundById = processStudents.searchById(searchId);
		if(foundById!=null) {
			foundById.show();
		}
		else {
			System.out.println("Therse is no student with id: " + searchId);
		}
		
		processStudents.rankStudents();
		System.out.println("Ranked of the students according the gpa");
		processStudents.showStudents();
		
		processStudents.removeById(processStudents.lastStudent().getId());
		System.out.println("Students after removing the last student");
		processStudents.showStudents();
		scanner.close();
		
	}

}
