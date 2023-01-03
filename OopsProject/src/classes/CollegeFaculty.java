package classes;

import interfaces.Drawable;
import interfaces.Teachable;

//the only way to achieve multiple inheritance
public class CollegeFaculty extends Faculty implements Teachable,Drawable{

	@Override
	public void printBonus() {
		
		System.out.println("BONUS : "+10000);
		
	}

	@Override
	public void onClassStart() {
		
		System.out.println("Teaching.... College Students....");
		
	}

	@Override
	public void draw() {
		
		System.out.println("Drawing periodic table.....");
		
	}

}
