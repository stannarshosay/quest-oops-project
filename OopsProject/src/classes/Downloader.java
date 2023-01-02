package classes;

public class Downloader implements Runnable {

	@Override
	public void run() {
		
		//Downloading
		for (int i = 1; i <= 10; i++) {
			System.out.println("Downloading "+i+"%");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
