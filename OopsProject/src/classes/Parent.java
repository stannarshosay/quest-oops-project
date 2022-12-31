package classes;

//final keyword for a class
// it restricts inheriting of this specific class or the class declared as final
public final class Parent {

	private boolean isParentStrict;

	public boolean isParentStrict() {
		return isParentStrict;
	}

	public void setParentStrict(boolean isParentStrict) {
		this.isParentStrict = isParentStrict;
	}

	
	public void printParentStrictness() {
		
		System.out.println("Is Parent Strict : "+this.isParentStrict);
		
	}
	
	public void toDo() {
		
		System.out.println("Watching News...");
		
	}
	
	
	
}
