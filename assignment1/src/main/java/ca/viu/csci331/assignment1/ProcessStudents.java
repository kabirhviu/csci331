package ca.viu.csci331.assignment1;

import ca.viu.csci331.assignment1.model.Student;

public class ProcessStudents {
	
	private Student[] students;
	private int studentCount;
	
	public ProcessStudents(int capacity) {
		setStudents(new Student[capacity]);
		studentCount = 0;
	}
	
	public void addStudent(Student student) {
		if(getStudentCount() < getStudents().length) {
			getStudents()[studentCount++] = student;
		}
		else {
			System.out.println("Capacity exceeded! cannot add any more student.");
		}
	}
	
	public void showStudents() {
		for(int i= 0; i < getStudentCount(); i++) {
			getStudents()[i].show();
			System.out.println();
		}
	}
	
	public void rankStudents() {
		for (int i= 0; i<getStudentCount(); i++) {
			for(int j=0; j<getStudentCount()-i-1; j++) {
				if(getStudents()[j].getGpa()<getStudents()[j+1].getGpa()) {
					swap(getStudents(), j, j+1);
				}
			}
		}
	}

	public Student searchByName(String name) {
		Student found = null;
		for(int i= 0; i < getStudentCount(); i++) {
			if(getStudents()[i].getName().equals(name)) {
				found = getStudents()[i];
				break;
			}
		}
		return found;
	}
	
	public Student searchById(String id) {
		Student found = null;
		for(int i= 0; i < getStudentCount(); i++) {
			if(getStudents()[i].getId().equals(id)) {
				found = getStudents()[i];
				break;
			}
		}
		return found;	
	}
	
	public Student topStudent() {
		Student top = getStudents()[0];
		for(int i= 1; i < getStudentCount(); i++) {
			if(getStudents()[i].getGpa()>top.getGpa()) {
				top = getStudents()[i];
			}
		}
		return top;
	}
	
	public Student lastStudent() {
		Student last = getStudents()[0];
		for(int i= 1; i < getStudentCount(); i++) {
			if(getStudents()[i].getGpa()<last.getGpa()) {
				last = getStudents()[i];
			}
		}
		return last;
	}
	
	public void removeById(String id) {
		for(int i= 0; i < getStudentCount(); i++) {
			if(students[i].getId().equals(id)) {				
				for(int j=i; j<getStudentCount()-1; j++) {
					students[j] = students[j+1];
				}
				studentCount--;
				break;
			}
		}
	}
	
	
	private void swap(Student[] students, int i, int j) {
		Student temp = students[i];
		students[i] = students[j];
		students[j] = temp;
	}

	public int getStudentCount() {
		return studentCount;
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

}
