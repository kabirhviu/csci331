package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

	private static void stackOverFlow() {
		stackOverFlow();
	}
	
	private static void badCode() {
		/*
		 * Bad code that attempt to use wrong array index.
		 * Program will terminate throwing an exception. 
		 */
		int[]array = new int[5];
		array[5]++;
		
//		try {
//			array[5]++;
//		}
//		catch(ArrayIndexOutOfBoundsException aiobe) {
//			aiobe.printStackTrace();
//			System.out.println("Array index out of bound exception occured!");
//		}
	

		/*
		 * Bad code that attempt to use a null object reference.
		 * Program will terminate throwing an exception.
		 */
		Object myObject = null;	
		myObject.toString();
		
//		try {
//			myObject.toString();
//		}
//		catch (NullPointerException npe) {
//			npe.printStackTrace();
//			System.out.println("Null pointer exception occured!");
//		}
		
		/*
		 * Bad code that will cause to eat up all stack memory
		 * Program will terminate throwing an exception.
		 */
		stackOverFlow();
		
		
//		try {
//			stackOverFlow();
//		}
//		catch(StackOverflowError soe) {
//			soe.printStackTrace();
//			System.out.println("Stack Overflow occured!");
//		}
		
	}
	
	public static void goodCode(String inputFileName, String outputFileName) {
		
		
		FileInputStream inputStream = null;
		FileOutputStream outputStream = null;
		
		try {
			inputStream = new FileInputStream(inputFileName);
		}
		catch (FileNotFoundException fnfe) {
			System.out.println("Input file, " + inputFileName + ", does not exists!");
		}
		
		
		if(inputStream != null) {
			try {
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		try {
			outputStream = new FileOutputStream(outputFileName);
		} 
		catch (FileNotFoundException e) {
			System.out.println("Output file, " + outputFileName + ", does not exists!");
		}
		
		if(outputStream != null) {
			try {
				outputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		/*
		 * Using Byte stream to copy file
		 */
		
		ByteStream byteStream = new ByteStream(inputFileName, outputFileName);
		
		try {
			byteStream.openInputOutputFiles();
			byteStream.copyFromInputFileToOutputFile();
		}
		catch (Exception e) {
			System.out.println("Failed to open input and output files: " + inputFileName + ", " + outputFileName);
		}
//		catch(IOException ioException) {
//			System.out.println("Failed to read from or write to file");
//		}
		finally {
			try {
				byteStream.closeInputOutputFilse();
			} catch (IOException e) {
				System.out.println("Failed to close input or output file");
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		String inputFileName= "resources/byteInputNotExist.txt";
		String outputFileName = "resources/byteOutputNotExist.txt";
		
//		String inputFileName = "resources/byteInput.txt";
//		String outputFileName = "resources/byteOutput.txt";
		
		badCode();
		
		goodCode(inputFileName, outputFileName);
		
	}

}
