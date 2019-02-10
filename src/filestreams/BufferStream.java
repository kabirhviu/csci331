package filestreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferStream {
	
	private String inputFileName;
	private String outputFileName;
	
	private BufferedReader inputStream = null;
	private PrintWriter outputStream = null;
	
	public BufferStream(String inputFileName, String outputFileName) {
		this.inputFileName = inputFileName;
		this.outputFileName = outputFileName;
	}
	
	public void openInputOutputFiles() throws IOException{
		inputStream = new BufferedReader(new FileReader(inputFileName));
		outputStream = new PrintWriter(new FileWriter(outputFileName));
	}
	
	public void closeInputOutputFilse() throws IOException {
		if (inputStream != null) {
			inputStream.close();
		}
		
		if( outputStream != null) {
			outputStream.close();
		}
	}
	
	public void copyFromInputFileToOutputFile() throws IOException {
		String dataLine;
		while((dataLine=inputStream.readLine()) != null) {
			outputStream.println(dataLine);
		}
	}

}
