package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import classes.Student;

public class RunDeSerializationObjectInputStream {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		//The process of stream to object is called deserialization
			
		File ramuFile = new File("H:\\QuestFullStack\\FileOperations\\ramu.txt");
		File sonuFile = new File("H:\\QuestFullStack\\FileOperations\\sonu.txt");
		
		if(!(ramuFile.exists()&&sonuFile.exists())) {
			System.out.println("Files Dont exist!");
			System.exit(0);
		}
		
		FileInputStream ramuIn = new FileInputStream(ramuFile);
		FileInputStream sonuIn = new FileInputStream(sonuFile);
		
		ObjectInputStream ramuObjectStream = new ObjectInputStream(ramuIn);
		ObjectInputStream sonuObjectStream = new ObjectInputStream(sonuIn);		
		
		Student ramu = (Student) ramuObjectStream.readObject();
		Student sonu = (Student) sonuObjectStream.readObject();	

		ramu.printDetails();	
		sonu.printDetails();
				
		ramuObjectStream.close();
		sonuObjectStream.close();
		
		ramuIn.close();
		sonuIn.close();
		

	}

}
