package exceptionHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptions {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("file.txt");
		} catch (IOException e) {
			System.out.println("File not found: " + e.getMessage());
		}
	}
}
