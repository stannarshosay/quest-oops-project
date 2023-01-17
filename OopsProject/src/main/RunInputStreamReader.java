package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunInputStreamReader {

	public static void main(String[] args) throws IOException {
		
		File file = new File("H:\\QuestFullStack\\FileOperations\\InputStreamReader.txt");

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

		FileInputStream in = new FileInputStream(file);
		InputStreamReader reader = new InputStreamReader(in);
		BufferedReader bReader = new BufferedReader(reader);
		
//		int readByte;
//		
//		while((readByte = reader.read())!=-1) {
//			
//			char readCharacter = (char) readByte;
//			
//			System.out.print(readCharacter);
//			
//		}
		
		String line;
		while((line = bReader.readLine()) !=null) {
			System.out.println(line);
		}

		bReader.close();
		reader.close();
		in.close();
		
	}

}
