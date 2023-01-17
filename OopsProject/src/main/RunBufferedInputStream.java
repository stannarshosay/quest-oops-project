package main;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class RunBufferedInputStream {

	public static void main(String[] args) throws IOException {
		
		File file = new File("H:\\QuestFullStack\\FileOperations\\BufferedInputStream.txt");

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
		BufferedInputStream bin = new BufferedInputStream(in);
		
		
		int readByte;
		
		while((readByte = bin.read())!=-1) {
			
			char readCharacter = (char) readByte;
			
			System.out.print(readCharacter);
			
		}

		bin.close();
		in.close();

	}

}
