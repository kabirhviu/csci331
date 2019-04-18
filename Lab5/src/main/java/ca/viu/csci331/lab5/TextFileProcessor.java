package ca.viu.csci331.lab5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TextFileProcessor {
	
	private String inputFile;
	private String outputFile;
	
	private BufferedReader inputStream;
	private PrintWriter outputStream;
	
	public TextFileProcessor(String inputFile, String outputFile) {
		this.setInputFile(inputFile);
		this.setOutputFile(outputFile);
		setInputStream(null);
		setOutputStream(null);
	}
	
	public String read() throws IOException {
		String text = null;
		String line;
		StringBuilder builder = new StringBuilder();
		if(getInputStream() == null ) {
			throw new IOException("No input stream to read from.");
		}
		do {
			line = getInputStream().readLine();
			builder.append(line);
		}
		while(line != null);

		if(builder.length()>0) {
			text = builder.toString();
		}
		return text;
	}
	
	
	public static String process(String text) {
		String processed = null;
		
		if(text.isEmpty()) {
			return null;
		}
		
		StringBuilder builder = new StringBuilder();
		
		String[] lines = text.split("\\.");
		int lineCount = 0;
		int wordCount = 0;
		for (String line: lines) {
			if(line !=null && line.isEmpty() == false && line.equals("null") == false) {
				String trimmed = line.trim();
				if(trimmed != null && trimmed.isEmpty() == false) {
					String[] words = trimmed.split("\\s");
					builder.append("\nSentence-" + ++lineCount + ", Word Count-" + words.length + "\n");
					builder.append(trimmed + ".\n");
					wordCount += words.length;
				}
			}
		}
		
		builder.append("\nTotal Sentences: " + lineCount + ", Total Words: "+ wordCount +"\n");
		
		if(builder.length()>0) {
			processed = builder.toString();
		}
		return processed;
		
	}
	
	
	public void write(String text) throws IOException {
		if(getOutputStream() == null ) {
			throw new IOException("No output stream to write into.");
		}
		getOutputStream().print(text);
		getOutputStream().flush();
		
	}
	
	public void openInputStream() throws IOException {
		if(getInputStream() != null) {
			getInputStream().close();
		}
		setInputStream(new BufferedReader(new FileReader(getInputFile())));
	}
	
	public void openOutputStream() throws IOException {
		if(getOutputStream() != null) {
			getOutputStream().close();
		}
		setOutputStream(new PrintWriter(new FileWriter(getOutputFile())));
	}
	
	public void closeInputStream() throws IOException {
		if(getInputStream() != null) {
			getInputStream().close();
		}
	}
	
	public void closeOutputStream() throws IOException {
		if(getOutputStream() != null) {
			getOutputStream().close();
		}
	}

	public String getInputFile() {
		return inputFile;
	}

	public void setInputFile(String inputFile) {
		this.inputFile = inputFile;
	}

	public String getOutputFile() {
		return outputFile;
	}

	public void setOutputFile(String outputFile) {
		this.outputFile = outputFile;
	}

	public BufferedReader getInputStream() {
		return inputStream;
	}

	public void setInputStream(BufferedReader inputStream) {
		this.inputStream = inputStream;
	}

	public PrintWriter getOutputStream() {
		return outputStream;
	}

	public void setOutputStream(PrintWriter outputStream) {
		this.outputStream = outputStream;
	}
	
	

}