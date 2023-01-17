package main;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class RunDataOutputStream {

	public static void main(String[] args) throws IOException {
		
		boolean hasLoggedIn = false;
		int rollNo = 256875;

		File file = new File("H:\\QuestFullStack\\FileOperations\\DataOutputStream.txt");

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
		DataOutputStream dout = new DataOutputStream(out);

		
//		dout.writeBoolean(hasLoggedIn);
		dout.writeInt(rollNo);
		
		dout.flush();

		dout.close();
		out.close();

		
	}

}
