package classes;

import interfaces.UsbPort;

//implement the abstract methods in the implementation classes
public class Keyboard implements UsbPort {

	@Override
	public void onConnect() {
		
		System.out.println("Typing......");
		
	}

}
