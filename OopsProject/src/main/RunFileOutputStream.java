package main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

//If you have to write primitive values into a file, use FileOutputStream class. (i.e bytes and char)
//But much preferred bytes here
public class RunFileOutputStream {

	public static void main(String[] args) throws IOException {
		
		
		File file = new File("H:\\QuestFullStack\\FileOperations\\fileOutputStream.txt");		
		
		if(file.exists()) {
			
			System.out.println("Yes it exists!");
			if(file.canWrite()) {
				System.out.println("FILE : Writable");
			}else {
				System.out.println("FILE : Unwritable");
			}
			
		}else {
			
			System.out.println("No such file exists!");
			file.createNewFile();
			System.out.println("File created at : "+file.getAbsolutePath());
			
		}
		
//		FileOutputStream out = new FileOutputStream("H:\\QuestFullStack\\FileOperations\\fileOutputStream.txt");
		
//		FileOutputStream out = new FileOutputStream(file.getAbsolutePath());
		
		FileOutputStream out = new FileOutputStream(file);
		
	
		for (char i = 'A'; i < 250; i++) {
			
			out.write((byte)i);
			System.out.println(i+" => Written");
			
		}		
		
//		out.write(-75);		
		
		out.close();
		

	}

}
