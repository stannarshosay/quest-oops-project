package classes;

public class CheckPackageBasedAccessSpecifier {

	public static void main(String[] args) {
		
		
		Teacher teacher = new Teacher();
		
		//protected variables and functions can be accessed outside the class
        //only condition that its in the same package
		teacher.salary= 15200l;
		teacher.printSalary();

	}

}
