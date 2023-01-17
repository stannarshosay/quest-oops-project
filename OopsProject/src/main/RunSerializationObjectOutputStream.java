package main;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import classes.Student;

public class RunSerializationObjectOutputStream {

	public static void main(String[] args) throws IOException {
		
		//The process of converting object to stream is called serialization
		// in order to serialize an object you have to implement Serializable interface for that specific class
		// eg. public class Student implements Serializable{}
		
		
		Student ramu = new Student();
		ramu.setAddress("Mumbai");
		ramu.setBloodGroup("B-ve");
		ramu.setName("Ramu Joseph");
		ramu.setRollNo(25);
		ramu.setMarks(new int[] {54,245,15,23});
		
		System.out.println("Ramu Created");
		
		Student sonu = new Student();
		sonu.setAddress("Delhi");
		sonu.setBloodGroup("AB+ve");
		sonu.setName("Sonu Raj");
		sonu.setRollNo(53);
		sonu.setMarks(new int[] {25,89,5,87,52});		
		
		System.out.println("Sonu Created");
		
		
		File ramuFile = new File("H:\\QuestFullStack\\FileOperations\\ramu.txt");
		File sonuFile = new File("H:\\QuestFullStack\\FileOperations\\sonu.txt");
		
		ramuFile.createNewFile();
		sonuFile.createNewFile();
		
		FileOutputStream ramuOut = new FileOutputStream(ramuFile);
		FileOutputStream sonuOut = new FileOutputStream(sonuFile);
		
		ObjectOutputStream ramuObjectStream = new ObjectOutputStream(ramuOut);
		ObjectOutputStream sonuObjectStream = new ObjectOutputStream(sonuOut);		
		
		ramuObjectStream.writeObject(ramu);		
		ramuObjectStream.flush();
		
		sonuObjectStream.writeObject(sonu);
		sonuObjectStream.flush();
				
		ramuObjectStream.close();
		sonuObjectStream.close();
		
		ramuOut.close();
		sonuOut.close();

	}

}
