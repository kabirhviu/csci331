package ca.viu.csci331.assignment1;

import org.junit.Test;

import ca.viu.csci331.assignment1.model.Student;
import org.junit.Assert;

public class ProcessStudentsTests {
	
	@Test
	public void testAddStudent() {
		Student students[] = {
				new Student("TOM", "S0001", 2.5),
				new Student("TTM", "S0002", 4.5),
				new Student("COOK", "S0003", 3.5),
				new Student("JERRY", "S0004", 4.0),
				new Student("DALE", "S0005", 5.0)};
		ProcessStudents processStudents = new ProcessStudents(5);
		Assert.assertTrue(processStudents.getStudentCount() == 0);
		int studentCount = 0;
		for (Student student: students) {
			processStudents.addStudent(student);
			studentCount++;
			Assert.assertTrue(processStudents.getStudentCount() == studentCount);
		}
	}
	
	@Test
	public void testTopStudent() {
		Student students[] = {
				new Student("TOM", "S0001", 2.5),
				new Student("TTM", "S0002", 4.5),
				new Student("COOK", "S0003", 3.5),
				new Student("JERRY", "S0004", 4.0),
				new Student("DALE", "S0005", 5.0)};
		ProcessStudents processStudents = new ProcessStudents(5);
		for (Student student: students) {
			processStudents.addStudent(student);
		}
		
		Student top = processStudents.topStudent();
		Assert.assertTrue(students[4].getGpa()==top.getGpa());
	}
	
	@Test
	public void testLastStudent() {
		Student students[] = {
				new Student("TOM", "S0001", 2.5),
				new Student("TTM", "S0002", 4.5),
				new Student("COOK", "S0003", 3.5),
				new Student("JERRY", "S0004", 4.0),
				new Student("DALE", "S0005", 5.0)};
		ProcessStudents processStudents = new ProcessStudents(5);
		for (Student student: students) {
			processStudents.addStudent(student);
		}
		
		Student last = processStudents.lastStudent();
		Assert.assertTrue(students[0].getGpa()==last.getGpa());
	}
	
	@Test
	public void testSearchByName() {
		Student students[] = {
				new Student("TOM", "S0001", 2.5),
				new Student("TTM", "S0002", 4.5),
				new Student("COOK", "S0003", 3.5),
				new Student("JERRY", "S0004", 4.0),
				new Student("DALE", "S0005", 5.0)};
		ProcessStudents processStudents = new ProcessStudents(5);
		for (Student student: students) {
			processStudents.addStudent(student);
		}
		
		Student found = processStudents.searchByName("JERRY");
		Assert.assertTrue(students[3].getId().equals(found.getId()));
		Student notfound = processStudents.searchByName("JIM");
		Assert.assertNull(notfound);
	}
	
	@Test
	public void testSearchById() {
		Student students[] = {
				new Student("TOM", "S0001", 2.5),
				new Student("TTM", "S0002", 4.5),
				new Student("COOK", "S0003", 3.5),
				new Student("JERRY", "S0004", 4.0),
				new Student("DALE", "S0005", 5.0)};
		ProcessStudents processStudents = new ProcessStudents(5);
		for (Student student: students) {
			processStudents.addStudent(student);
		}
		
		Student found = processStudents.searchById("S0003");
		Assert.assertTrue(students[2].getName().equals(found.getName()));
		Student notfound = processStudents.searchById("S0006");
		Assert.assertNull(notfound);
	}
	
	@Test
	public void testRankStudents() {
		Student students[] = {
				new Student("TOM", "S0001", 2.5),
				new Student("TTM", "S0002", 4.5),
				new Student("COOK", "S0003", 3.5),
				new Student("JERRY", "S0004", 4.0),
				new Student("DALE", "S0005", 5.0)};
		
		Student expectedtudents[] = {
				new Student("DALE", "S0005", 5.0),
				new Student("TTM", "S0002", 4.5),
				new Student("JERRY", "S0004", 4.0),
				new Student("COOK", "S0003", 3.5),
				new Student("TOM", "S0001", 2.5)};
		
		ProcessStudents processStudents = new ProcessStudents(5);
		for (Student student: students) {
			processStudents.addStudent(student);
		}
		
		processStudents.rankStudents();
		Student[] actualStudents = processStudents.getStudents();
		for(int i=0; i<5; i++) {
			Assert.assertTrue(expectedtudents[i].getGpa() == actualStudents[i].getGpa());
			Assert.assertTrue(expectedtudents[i].getId().equals(actualStudents[i].getId()));
			Assert.assertTrue(expectedtudents[i].getName().equals(actualStudents[i].getName()));
		}
	}
	
}
