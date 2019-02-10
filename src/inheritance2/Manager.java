package inheritance2;

import java.util.Date;

public class Manager extends Employee{
	private String department;
	
	public Manager(String name, double salary, Date birthDay, String department) {
		super(name, salary, birthDay);
		this.department = department;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", Department: " + department;
	}
	
	

}
