package ca.viu.csci331.lab5;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import ca.viu.csci331.lab5.TextFileProcessor;

public class TextFileProcessorTest {
	
	private static final String inputFile = "./src/test/resources/original.txt";
	private static final String outputFile = "./src/test/resources/processed.txt";
	
	@Test
	public void testOpenInputStream() throws IOException {
		TextFileProcessor textProcessor = new TextFileProcessor(inputFile, outputFile);
		textProcessor.openInputStream();
		Assert.assertTrue(textProcessor.getInputStream() != null);
		textProcessor.closeInputStream();
	}
	
	@Test
	public void testOpenOutputStream() throws IOException {
		TextFileProcessor textProcessor = new TextFileProcessor(inputFile, outputFile);
		textProcessor.openOutputStream();
		Assert.assertTrue(textProcessor.getOutputStream() != null);
		textProcessor.closeOutputStream();
	}
	
	@Test
	public void testRead() throws IOException {
		TextFileProcessor textProcessor = new TextFileProcessor(inputFile, outputFile);
		textProcessor.openInputStream();
		String text = textProcessor.read();
		Assert.assertTrue(text != null);
		textProcessor.closeInputStream();
		
	}
	
	@Test
	public void testWrite() throws IOException {
		TextFileProcessor textProcessor = new TextFileProcessor(inputFile, outputFile);
		String text = "Hello world. Hello world. Hello world.";
		textProcessor.openOutputStream();
		textProcessor.write(text);
		textProcessor.closeOutputStream();
	}
	
	@Test
	public void testProcess() {
		
		String text = "Hello world. Hello world. Hello world.";
		String expected = "\nSentence-1, Word Count-2\nHello world.\n\nSentence-2, Word Count-2\nHello world.\n\nSentence-3, Word Count-2\nHello world.\n\nTotal Sentences: 3, Total Words: 6\n";
		String actual = TextFileProcessor.process(text);
		Assert.assertTrue(expected.equals(actual));
	}

}
