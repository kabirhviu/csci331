package filestreams;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Using Byte stream to copy file
		 */
		
		String byteInputFileName = "resources/byteInput.txt";
		String byteOutputFileName = "resources/byteOutput.txt";
		
		ByteStream byteStream = new ByteStream(byteInputFileName, byteOutputFileName);
		
		try {
			byteStream.openInputOutputFiles();
			byteStream.copyFromInputFileToOutputFile();
		}
		catch (FileNotFoundException fnfExeption) {
			System.out.println("Failed to open input and output files: " + byteInputFileName + ", " + byteOutputFileName);
		}
		catch(IOException ioException) {
			System.out.println("Failed to read from or write to file");
		}
		finally {
			try {
				byteStream.closeInputOutputFilse();
			} catch (IOException e) {
				System.out.println("Failed to close input or output file");
			}
		}
		
		/*
		 * Using Character stream to copy file
		 */
		String charInputFileName = "resources/charInput.txt";
		String charOutputFileName = "resources/charOutput.txt";
		CharacterStream characterStream = new CharacterStream(charInputFileName, charOutputFileName);
		
		try {
			characterStream.openInputOutputFiles();
			characterStream.copyFromInputFileToOutputFile();
		}
		catch(IOException ioException) {
			System.out.println("Failed to read from or write to file");
		}
		finally {
			try {
				characterStream.closeInputOutputFilse();
			} catch (IOException e) {
				System.out.println("Failed to close input or output file");
			}
		}
		
		
		/*
		 * Using Buffer stream to copy file 
		 */
		String bufferInputFileName = "resources/bufferInput.txt";
		String bufferOutputFileName = "resources/bufferOutput.txt";
		BufferStream bufferStream = new BufferStream(bufferInputFileName, bufferOutputFileName);
		
		try {
			bufferStream.openInputOutputFiles();
			bufferStream.copyFromInputFileToOutputFile();
		}
		catch(IOException ioException) {
			System.out.println("Failed to read from or write to file");
		}
		finally {
			try {
				bufferStream.closeInputOutputFilse();
			} catch (IOException e) {
				System.out.println("Failed to close input or output file");
			}
		}
		

		/*
		 * Using Object stream to copy object
		 */
		String objectInputFileName = "resources/objectInput.txt";
		String objectOutputFileName = "resources/objectOutput.txt";
		ObjectStream objectStream = new ObjectStream(objectInputFileName, objectOutputFileName);
		
		try {
			objectStream.openInputFile();
			Point point = objectStream.readFromInputFile();
			point.show();
			objectStream.openOutputFile();
			objectStream.writeToOutputFile(point);;
			
		}
		catch(IOException ioException) {
			System.out.println("Failed to read from or write to file");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				objectStream.closeInputOutputFiles();
			} catch (IOException e) {
				System.out.println("Failed to close input or output file");
			}
		}
		
	}

}
