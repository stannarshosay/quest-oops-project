package main;

import classes.Circle;
import classes.Keyboard;
import classes.Mouse;
import classes.PenDrive;
import classes.Rectangle;
import interfaces.Drawable;

public class RunInterface {

	public static void main(String[] args) {
		
		//EXMAPLE 1
		
//		Keyboard keyboard = new Keyboard();
//		keyboard.onConnect();
//		
//		Mouse mouse = new Mouse();
//		mouse.onConnect();
//		
//		PenDrive penDrive = new PenDrive();
//		penDrive.onConnect();
		
		//EXAMPLE 2
		
		Rectangle rectangle = new Rectangle();
		rectangle.draw();
		
		Circle circle = new Circle();
		circle.draw();
		
		Drawable triangle = new Drawable() {

			@Override
			public void draw() {
				
				System.out.println("Drawing triangle....");
				
			}
			
		};		
		triangle.draw();
		
		

	}

}
