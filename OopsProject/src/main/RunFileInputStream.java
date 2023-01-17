package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Java FileInputStream class obtains input bytes from a file.
//It is used for reading byte-oriented data (streams of raw bytes) such as image data, audio, video etc.
//You can also read character-stream data.
//But, for reading streams of characters, it is recommended to use FileReader class
public class RunFileInputStream {

	public static void main(String[] args) throws IOException {
		
		File file = new File("H:\\QuestFullStack\\FileOperations\\fileInputStream.txt");		
		
		if(file.exists()) {
			
			System.out.println("Yes it exists!");
			if(file.canRead()) {
				System.out.println("FILE : Readable");
			}else {
				System.out.println("FILE : Unreadable");
			}
			
		}else {
			
			System.out.println("No such file exists!");
			file.createNewFile();
			System.out.println("File created at : "+file.getAbsolutePath());
			
		}
		
		FileInputStream in = new FileInputStream(file);
		
		
		int readByte = in.read();
		
		char readCharacter = (char)readByte;
		
		System.out.println("Read Byte Character Representation : "+readCharacter);
		
		
		in.close();

	

	}

}
