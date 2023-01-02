package main;

import classes.Downloader;

public class RunMultiThreading {

	public static void main(String[] args) throws InterruptedException {
		
		//Computation
		for (int i = 1; i <= 10; i++) {
			System.out.println("Computation on Main Thread "+i+"%");
			
			Thread.sleep(500);
			
		}
		
		Thread downloadThread = new Thread(new Downloader());
		downloadThread.start();
		
		//Computation
		for (int i = 11; i <= 20; i++) {
			System.out.println("Computation on Main Thread "+i+"%");
			
			Thread.sleep(500);
		}

	}

}
