package main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class RunOutputStreamWriter {

	public static void main(String[] args) throws IOException {
		
		String stringToBeWritten = "Hello World!\nI am Stannars\nHelllllooooo\tWoorlld";

		File file = new File("H:\\QuestFullStack\\FileOperations\\OutputStreamWriter.txt");

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

		FileOutputStream out = new FileOutputStream(file);
		OutputStreamWriter writer = new OutputStreamWriter(out);

		writer.write(stringToBeWritten);

		writer.close();
		out.close();


	}

}
