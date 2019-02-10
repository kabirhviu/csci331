package filestreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStream {
	
	private String inputFileName;
	private String outputFileName;
	
	private ObjectInputStream inputStream = null;
	private ObjectOutputStream outputStream = null;
	
	public ObjectStream(String inputFileName, String outputFileName) {
		this.inputFileName = inputFileName;
		this.outputFileName = outputFileName;
	}
	
	public void openInputOutputFiles() throws IOException{
		inputStream = new ObjectInputStream(new FileInputStream(inputFileName));
		outputStream = new ObjectOutputStream(new FileOutputStream(outputFileName));
	}
	
	public void openInputFile() throws IOException{
		inputStream = new ObjectInputStream(new FileInputStream(inputFileName));
	}
	
	public void openOutputFile() throws IOException{
		outputStream = new ObjectOutputStream(new FileOutputStream(outputFileName));
	}
	
	public void closeInputFile() throws IOException {
		if (inputStream != null) {
			inputStream.close();
		}
	}
	
	public void closeOutputFile() throws IOException {
		if( outputStream != null) {
			outputStream.close();
		}
	}
	
	public void closeInputOutputFiles() throws IOException {
		if (inputStream != null) {
			inputStream.close();
		}
		
		if( outputStream != null) {
			outputStream.close();
		}
	}
	
	public void writeToOutputFile(Point object) throws IOException {
		if( outputStream != null) {
			outputStream.writeObject(object);
		}
		else {
			throw new IOException("Output stream is not available");
		}
	}
	
	public Point readFromInputFile() throws IOException, ClassNotFoundException {
		if(inputStream != null) {
			return (Point) inputStream.readObject();
		}
		else {
			throw new IOException("Input stream is not available");
		}
	}
	
}
