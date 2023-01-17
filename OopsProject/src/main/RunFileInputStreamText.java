package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class RunFileInputStreamText {

	public static void main(String[] args) throws IOException {

		File file = new File("H:\\QuestFullStack\\FileOperations\\fileInputStreamText.txt");

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
		
		
		int readByte;
		
		while((readByte = in.read())!=-1) {
			
			char readCharacter = (char) readByte;
			
			System.out.print(readCharacter);
			
		}

		in.close();

	}

}
