package main;

import interfaces.Playable;

public class RunFunctionalInterface {
	
	
	public static void main(String[] args) {
		
		
		Playable video = new Playable() {
			
			@Override
			public void play() {
				
				System.out.println("Playing Video.....");
				
			}
		};
		
		video.play();
		
		// USING LAMBDA EXPRESSION
		
		// the interface should be a functional interface i.e 
		// it should only have one abstract method
		Playable audio = () -> System.out.println("Playing Audio....");
		audio.play();
		
		
		// when you have multiple statements
		Playable animation = () -> {
			
			String text = "Animation....";
			System.out.println("Playing "+text);
			
		};
		animation.play();
		
	}
	

}
