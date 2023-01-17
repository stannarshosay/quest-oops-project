package main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class RunBufferedWriter {

	public static void main(String[] args) throws IOException {
		
		String stringToBeWritten = "Hey Stannars!";

		File file = new File("H:\\QuestFullStack\\FileOperations\\BufferedWriter.txt");

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
//		BufferedWriter bWriter = new BufferedWriter(writer);
//		
//		bWriter.write(stringToBeWritten);
//		bWriter.newLine();
//		bWriter.newLine();
//		bWriter.write("Some more text!");
		
		//append to the file pass a boolean value to the constructor stating append state
		//should it do it send true
		FileWriter writer = new FileWriter(file,true);
		BufferedWriter bWriter = new BufferedWriter(writer);
		
		bWriter.newLine();
		bWriter.append("This is the appended Data! YEAH");
		
		bWriter.flush();
		
		bWriter.close();
		writer.close();

	}

}
