package classes;

public class Bird {
	
	private boolean doesFly;
	public boolean isMulticolor;
	protected boolean doesSwim;
	
	private void printDoesFly() {
		
		//accessing private property doesFly within the class
		System.out.println("Does Fly" + this.doesFly);
		
	}
	
    public void printIsMulticolor() {
		
    	//accessing public property isMulticolor within the class
		System.out.println("Multicolor" + this.isMulticolor);
		
	}
    
    protected void printDoesSwim() {
		
    	//accessing protected property doesSwim within the class
		System.out.println("Does Swim" + this.doesSwim);
		
	}
    
    public void printBirdProperties() {
    	
    	//calling private function 
    	this.printDoesFly();
    	
    	//calling public function
    	this.printIsMulticolor();
    	
    	//calling protected function
    	this.printDoesSwim();
    	
    }
    
    

}
