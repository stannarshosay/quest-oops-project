package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RunFileWriter {

	public static void main(String[] args) throws IOException {
		
		String stringToBeWritten = "Hey Stannars!";

		File file = new File("H:\\QuestFullStack\\FileOperations\\FileWriter.txt");

		if (file.exists()) {

			System.out.println("Yes it exists!");
			if (file.canWrite()) {
				System.out.println("FILE : Writable");
			} else {
				System.out.println("FILE : Unwritable");
			}

		} else {

			System.out.println("No such file exists!");
			file.createNewFile();
			System.out.println("File created at : " + file.getAbsolutePath());

		}

		//overwriting the file
//		FileWriter writer = new FileWriter(file);
//		writer.write(stringToBeWritten);
		
		//append to the file pass a boolean value to the constructor stating append state
		//should it do it send true
		FileWriter writer = new FileWriter(file,true);
		writer.append("\nThis is the appended Data! YEAH");
		
		writer.close();


	}

}
