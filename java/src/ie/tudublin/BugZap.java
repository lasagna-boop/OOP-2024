package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet {
	public void settings() {
		size(1000, 1000);
	}

	public void setup() {
		colorMode (RGB); 
		background(0);

		
	float r = random(500);
	rect (r, r, 50, 100);


	}
	
	float playerX = 400;
	float playerY = 400; 

	public void keyPressed()
	{
		if (keyCode == LEFT)
		{
			System.out.println("Left arrow pressed");
			playerX += -20;
			
		}
		if (keyCode == RIGHT)
		{
			System.out.println("Right arrow pressed");
			playerX += 20 ; 
		}
		if (keyCode == UP)
		{ 
			System.out.println("U UP");
			playerY += -20 ;
		}
		if (keyCode == DOWN) 
		{	
			System.out.println("U DOWN") ; 
			playerY += 20 ; 
		}
	}

	int gameMode = 0;


	public void draw() {
	rect(playerX, playerY, 90, 90); 


	stroke(1, 0, 255);
	circle(500, 450 , 50) ; 


	}
}
