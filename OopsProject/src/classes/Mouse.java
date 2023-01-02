package classes;

import interfaces.UsbPort;

public class Mouse implements UsbPort {

	@Override
	public void onConnect() {
		
		System.out.println("Move mouse pointer....");
		
	}

}
