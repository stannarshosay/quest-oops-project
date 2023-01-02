package classes;

import interfaces.UsbPort;

public class PenDrive implements UsbPort{

	@Override
	public void onConnect() {
		
		System.out.println("Transfering files....");
		
	}

}
