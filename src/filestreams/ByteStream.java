package filestreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream {
	
	private String inputFileName;
	private String outputFileName;
	
	private FileInputStream inputStream = null;
	private FileOutputStream outputStream = null;
	
	public ByteStream(String inputFileName, String outputFileName) {
		this.inputFileName = inputFileName;
		this.outputFileName = outputFileName;
	}
	
	public void openInputOutputFiles() throws FileNotFoundException{
		inputStream = new FileInputStream(new File(inputFileName));
		outputStream = new FileOutputStream(new File(outputFileName));
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
		int dataByte;
		while((dataByte=inputStream.read()) != -1) {
			outputStream.write(dataByte);
		}
	}

}
