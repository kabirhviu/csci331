package inheritance2;

import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		Date empBirthDay = new Date();
		
		Employee employee = new Employee("Tim", 100000.0, empBirthDay);
		System.out.println(employee.toString());
		
		Manager manager = new Manager("Dave", 120000.0, empBirthDay, "IT");
		System.out.println(manager.toString());
		
		Employee empRef;
		empRef = new Employee("Tim", 100000.0, empBirthDay);
		System.out.println(empRef.toString());
	
		
		empRef = new Manager("Dave", 120000.0, empBirthDay, "IT");
		System.out.println(empRef.toString());
		
		/**
		 * You cannot call any Manager specific methods from Employee reference
		 * although you have instantiated a Manager object to Employee reference
		 */
		//empRef.getDepartment();
		
		
		/**
		 * You can call Manager specific methods from Employee reference by type casting
		 * the Employee reference into Manager. 
		 * Before you type cast, you must make sure that the original object that is referred
		 * by the Employee reference is a Manager object.
		 * You can check the above by using the instanceof operator
		 */
		if(empRef instanceof Manager) {
			System.out.println("Department: " + ((Manager)empRef).getDepartment());
		}
		
		empRef = new Employee("Tim", 100000.0, empBirthDay);
		System.out.println(empRef.toString());
		
		
		/**
		 * You are not allowed to type cast a super class object into sub class
		 */
//		if(empRef instanceof Employee) {
//			System.out.println("Department: " + ((Manager)empRef).getDepartment());
//		}
		
		Manager mngRef;
		
		/**
		 * Following instantiation is not possible 
		 */
		//mngRef = new Employee("Tim", 100000.0, empBirthDay);
		
		mngRef = new Manager("Dave", 120000.0, empBirthDay, "IT");
		System.out.println(mngRef.toString());
		
		Employee employees[] = new Employee[3];
		employees[0] = new Employee("Tim", 100000.0, empBirthDay);
		employees[1] = new Manager("Dave", 120000.0, empBirthDay, "IT");
		employees[2] = new Employee("Jason", 80000.0, empBirthDay);
		
		for (Employee emp: employees) {
			System.out.println(emp.toString());
		}
	}

}
