package inheritance2;

import java.util.Date;

public class Employee {
	protected String name;
	protected double salary;
	protected Date birthDay;
	
	public Employee(String name, double salary, Date birthDay) {
		this.name = name;
		this.salary = salary;
		this.birthDay = birthDay;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * @return the birthDay
	 */
	public Date getBirthDay() {
		return birthDay;
	}
	/**
	 * @param birthDay the birthDay to set
	 */
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	
	public String toString() {
		return "Name: " + name + ", Salary: " + salary + ", Birth Day: "+ birthDay ;
	}

}
