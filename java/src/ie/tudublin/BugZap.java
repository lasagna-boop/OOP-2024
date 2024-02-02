package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet {
	float playerWidth, playerX, playerY, bugX, bugY, bugWidth;
	public void settings() {
		size(500, 500);
	}

	public void setup() {
		colorMode (RGB); 
		background(0);
		playerWidth = 20;
		playerX = width/2;
		playerY = height - (playerWidth/2);

		bugX = random(0 + bugWidth, width - bugWidth);
		bugY = 0 + bugWidth/2;
		bugWidth = 50;
	}

	public void keyPressed()
	{
		if (keyCode == LEFT)
		{
			if(playerX > (0 + playerWidth)){
				playerX -= 20;
			}
			
		}
		if (keyCode == RIGHT)
		{
			if(playerX < (width - playerWidth)){
				playerX += 20; 
			}
		}
		if (keyCode == ' ')
		{ 
			line(playerX, (playerY-playerWidth/2), playerX, 0);
		}
	}

	int gameMode = 0;

	//separate function for player
	public void drawPlayer(float x, float y, float w) {
		float h = w/2;
		float LeftX, RightX, TopY, BottomY;
		noFill();
		stroke(255);
		
		LeftX = (x - w/2);
		RightX = (x + w/2);
		TopY = (y - h/2);
		BottomY = (y + h/2);

		line(LeftX, TopY, RightX, TopY);
		line(LeftX, BottomY, RightX, BottomY);
		line(RightX, TopY, RightX, BottomY);
		line(LeftX, TopY, LeftX, BottomY); 
	
	}


	//separate function for bug
	public void drawBug(float x, float y, float w){
		square(x, y, w);
	}


	//void draw 
	public void draw() {
		background(0);

		if ((frameCount % 60) == 0 ) {
			bugX += random(-30, 30);
			bugY += random(5, 30);

			if (bugX < (0+bugWidth)){
				bugX = bugWidth; 
			} 
			else if (bugX > (width - bugWidth)) {
				bugX = width - bugWidth;
			}
		 

		}
		
		drawBug(bugX, bugY, bugWidth);
		drawPlayer(playerX, playerY, playerWidth);
	}
}
