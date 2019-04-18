package ca.viu.csci331.lab5;

import java.io.IOException;

public class Main {
	
	private static final String inputFile = "./src/main/resources/original.txt";
	private static final String outputFile = "./src/main/resources/processed.txt";
	
	public static final void main(String[] args) {
		
		TextFileProcessor textProcessor = new TextFileProcessor(inputFile, outputFile);
		try {
			textProcessor.openInputStream();
			String text = textProcessor.read();
			String processed = textProcessor.process(text);
			textProcessor.openOutputStream();
			textProcessor.write(processed);
			System.out.println(text);
		}
		catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
		
	}

}
