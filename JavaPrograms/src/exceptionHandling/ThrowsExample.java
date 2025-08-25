package exceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample {

	public static void main(String[] args) throws IOException {
		readFile();
	}

	static void readFile() throws IOException {
		FileReader fr = new FileReader("test.txt"); // May throw FileNotFoundException
	}
}
