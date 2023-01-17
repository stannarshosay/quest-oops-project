package main;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RunFileReader {

	public static void main(String[] args) throws IOException {
		
		File file = new File("H:\\QuestFullStack\\FileOperations\\FileReader.txt");

		if (file.exists()) {

			System.out.println("Yes it exists!");
			if (file.canRead()) {
				System.out.println("FILE : Readable");
			} else {
				System.out.println("FILE : Unreadable");
			}

		} else {

			System.out.println("No such file exists!");
			file.createNewFile();
			System.out.println("File created at : " + file.getAbsolutePath());

		}

		System.out.println("\n\n");

		FileReader reader = new FileReader(file);
		
		int readChar;
		
		while((readChar = reader.read()) != -1) {
			System.out.print((char)readChar);
		}
		
		reader.close();

	}

}
