package main;

import classes.Teacher;

public class CheckPackageBasedAccessModifier {

	public static void main(String[] args) {
		
		Teacher teacher = new Teacher();
		//protected variables and functions can't be accessed outside the class
        //unless its in the same package
//		teacher.salary = 56200l;
//		teacher.printSalary();

	}

}
