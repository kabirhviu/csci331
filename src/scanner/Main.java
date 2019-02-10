package scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		/**
		 * Reading one integer from the console
		 */
//		System.out.println("Enter an integer: ");
//		Scanner sc = new Scanner(System.in);
//	    int i = sc.nextInt();
//	    System.out.println("You have entered: " + i);
		
		
		/**
		 * Reading five integers from the console
		 */
//		System.out.println("\nEnter 5 integers separated by space: \n");
//		Scanner sc = new Scanner(System.in);
//		while(sc.hasNextInt()){
//			int aInt = sc.nextInt();
//			System.out.println(aInt);
//		}
		
		/**
		 * Reading five integers from console as a single line
		 */
//		System.out.println("\nEnter 5 integers seperated by space: \n");
//		Scanner sc = new Scanner(System.in);
//		String line = sc.nextLine();
//		System.out.println(line);
		
		/**
		 * Reading from a string one token after another
		 */
//		String input = "12 33 hello world";
//		Scanner sc = new Scanner(input);	
//		while(sc.hasNext()) {
//			System.out.println(sc.next());
//		}
		
		/**
		 * Reading from a string one token after another as a different 
		 * types of data  
		 */
//		String input = "12 33 hello world";
//		Scanner sc = new Scanner(input);
//		int aInt = sc.nextInt();
//		System.out.println(aInt);
//		int anotherInt = sc.nextInt();
//		System.out.println(anotherInt);
//		String aString = sc.next();
//		System.out.println(aString);
//		String anotherString = sc.next();
//		System.out.println(anotherString);
		
		
		/**
		 * Reading from a string one token after another as a different 
		 * types of data and using specific delimiter 
		 */
//		String input = "12/33/hello/world";
//		Scanner sc = new Scanner(input);
//		sc.useDelimiter("/");
//		int aInt = sc.nextInt();
//		System.out.println(aInt);
//		int anotherInt = sc.nextInt();
//		System.out.println(anotherInt);
//		String aString = sc.next();
//		System.out.println(aString);
//		String anotherString = sc.next();
//		System.out.println(anotherString);
		
		
		
		/**
		 * Reading data from a file using Scanner
		 */
	    
	    Scanner scFile = null;
		try {
			scFile = new Scanner(new File("resources/numbers"));
			while (scFile.hasNextInt()) {
		          int aInt = scFile.nextInt();
		          System.out.println(aInt);
		     }
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      

	}

}
