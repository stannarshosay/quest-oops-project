package main;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import classes.Employee;

public class RunReflection {

	public static void main(String[] args) throws ClassNotFoundException {
	
		Employee object = new Employee();
		///////
		
		
		Field fields[] = object.getClass().getDeclaredFields();
		
		for(Field field:fields) {
			
			int modifier = field.getModifiers();
				
			System.out.println(field.getName() + " : "+Modifier.isPublic(modifier));
			
		}
		
		
		System.out.println("\n\n");
		
		Method methods[] = object.getClass().getMethods();
		
		for(Method method:methods) {
			
			System.out.println(method.getName());
			
		}
		
		
		
		// METHODS TO GET CLASS OBJECT
		
		// the following objects are same i.e all represent the Class object of the class Employee
		
		Class classFromObject = object.getClass(); //method 1
		
		Class classFromDotClass = Employee.class; //method 2
		
		Class classFromForName = Class.forName("classes.Employee"); //method 3
		

	}

}
