package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet {
	public void settings() {
		size(1000, 1000);
	}

	public void setup() {
		colorMode (RGB); 
		background(0);
	}
	
	float x = 400;
	float y = 400; 
	


	public void keyPressed()
	{
		if (keyCode == LEFT)
		{
			System.out.println("Left arrow pressed");
			x += -20;
			
		}
		if (keyCode == RIGHT)
		{
			System.out.println("Right arrow pressed");
			x += 20 ; 
		}
		if (keyCode == UP)
		{ 
			System.out.println("U UP");
			y += -20 ;
		}
		if (keyCode == DOWN) 
		{	
			System.out.println("U DOWN") ; 
			y += 20 ; 
		}
	}

	int gameMode = 0;

	public void draw() {

		circle(15, 30, 45);
		circle (x, y, 90); 

	}
}
