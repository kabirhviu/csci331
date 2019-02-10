package filestreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStream {
	
	private String inputFileName;
	private String outputFileName;
	
	private FileReader inputStream = null;
	private FileWriter outputStream = null;
	
	public CharacterStream(String inputFileName, String outputFileName) {
		this.inputFileName = inputFileName;
		this.outputFileName = outputFileName;
	}
	
	public void openInputOutputFiles() throws IOException{
		inputStream = new FileReader(inputFileName);
		outputStream = new FileWriter(outputFileName);
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
		int dataCharacter;
		while((dataCharacter=inputStream.read()) != -1) {
			outputStream.write(dataCharacter);
		}
	}

}
