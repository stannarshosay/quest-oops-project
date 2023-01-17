package main;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class RunDataInputStream {

	public static void main(String[] args) throws IOException {

		File file = new File("H:\\QuestFullStack\\FileOperations\\DataInputStream.txt");

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
		DataInputStream din = new DataInputStream(in);

		boolean hasLoggedIn = din.readBoolean();

		System.out.println(hasLoggedIn);

		din.close();
		in.close();

	}

}
