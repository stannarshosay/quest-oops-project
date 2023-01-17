package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RunBufferedReader {

	public static void main(String[] args) throws IOException {
		
		File file = new File("H:\\QuestFullStack\\FileOperations\\BufferedReader.txt");

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
		BufferedReader bReader = new BufferedReader(reader);
		
		// read byte level
//		int readChar;
//		
//		while((readChar = bReader.read()) != -1) {
//			System.out.print((char)readChar);
//		}
		
		//read line by line
		
		String line;
				
		while((line = bReader.readLine()) != null) {
			System.out.println(line.trim());
		}
		
		bReader.close();
		reader.close();

	}

}
