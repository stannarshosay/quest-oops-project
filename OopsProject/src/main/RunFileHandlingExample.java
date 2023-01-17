package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class RunFileHandlingExample {

	public static void main(String[] args) throws IOException {
		
		File file = new File("H:\\QuestFullStack\\FileOperations\\names.txt");

		if (!file.exists()) {
			System.out.println("File is not there");			
			System.exit(0);
		}

		FileReader reader = new FileReader(file);
		BufferedReader bReader = new BufferedReader(reader);
		
		
		String line;
		int i = 0;
				
		while((line = bReader.readLine()) != null) {
			System.out.println((++i)+") "+line.trim());
			
			File newFolder = new File("H:\\QuestFullStack\\FileOperations\\Batch\\"+line.trim());
			newFolder.mkdir();
			
		}
		
		bReader.close();
		reader.close();

	}

}
