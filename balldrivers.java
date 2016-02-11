public class balldrivers
{
	 public static void main(String[] args)
	 {
		 GameArena area= new GameArena(700,700);
		 Ball apple = new Ball(250,250,25,"blue");
		 area.addBall(apple); 

		 int xspeed =20;
		 int yspeed =20;
		 int x =0; 
		 int y =0;
		 int time=0;
		 
		 double yp = apple.getYPosition();
		 double xp = apple.getXPosition();

		 double distx = 0;
		 double disty = 0;
		 double finaldist = 0;
		 
		 int checkrange = 25;
	
		 Ball[] balls = new Ball[25];
		 double[]xSpeeds = new double [25];
		 double[]ySpeeds = new double [25];
		 
		for (int i = 0 ; i < balls.length; i++)
		{
		    balls[i] = new Ball(Math.random()*500, Math.random()*500, 25, "red" );
		    xSpeeds[i] = Math.random() * 25;
			ySpeeds[i] = Math.random() * 25;
			area.addBall(balls[i]);	
			
		}
		 
	while (true){
		
		
		for (int i = 0; i < balls.length; i++)
		{
			double ax = balls[i].getXPosition ();
			double ay = balls[i].getYPosition ();
			
			double appleYP = apple.getYPosition();
			double appleXP = apple.getXPosition();
			
				if (ax > 700 || ax < 0)
				{
					xSpeeds[i] = - xSpeeds[i]; // reverse direction
				}				
				if (ay > 700 || ay < 0)
				{
					ySpeeds[i] = - ySpeeds[i]; // reverse direction
				}
				
				balls[i].setXPosition (ax + xSpeeds[i]);
				balls[i].setYPosition (ay + ySpeeds[i]);
	
		}	

			
				
		for (int i = 0; i < balls.length; i++)
		{
	     double ax = balls[i].getXPosition ();
	     double ay = balls[i].getYPosition ();	
		 double getyp = apple.getYPosition();
		 double getxp = apple.getXPosition();

		 
			distx = ax - getxp;
			distx = distx * distx;
	
			disty = ay - getyp;
			disty = disty * disty;
			
			finaldist = distx + disty;
			finaldist = Math.sqrt(finaldist);
			
			
			if (finaldist < checkrange)
			{
			System.out.println("Ball no." + balls[i] + " caught");
			area.removeBall(balls[i]);
			
			
			}
			
			
			if (i==balls.length)
			{
				i = 0;
			}
			
			}
		

	//System.out.println(finaldist);
	
	if (area.upPressed()==true)
    {
		double moveYP = apple.getYPosition();
		//System.out.println("Bluey " + moveYP);
		apple.setYPosition(moveYP-y);
		y = y + yspeed;
		y = 30;
		area.pause();
			
				
				if (moveYP < 0)
				{
					apple.setYPosition(700);
				}	
				

	}
		if (area.downPressed()==true)
    {
		
		double moveYP = apple.getYPosition();	
		//System.out.println("Bluey " + moveYP);
		apple.setYPosition(moveYP+y);
		y = y + xspeed;
		y = 30;
		area.pause();
		
				if (moveYP > 700)
				{
					apple.setYPosition(0);
				}

	}
		if (area.leftPressed()==true)
		{
		double moveXP = apple.getXPosition();
		//System.out.println("Bluex " + moveXP);
		apple.setXPosition(moveXP-x);
		x = x + xspeed;
		x = 30;
		area.pause();
		
				if (moveXP < 0)
				{
					apple.setXPosition(700);
				}
		}
		
		if (area.rightPressed()==true)
		{
		double moveXP = apple.getXPosition();
		//System.out.println("Bluex " + moveXP);
		apple.setXPosition(moveXP+x);
		x = x + xspeed;
		x = 30;
		area.pause();
		
				if (moveXP > 700)
				{
					apple.setXPosition(0);
				}
		}	
	
		
			 area.pause();
			 
	
			//	System.out.println("Redx " + redx + "Redy" + redy );**/
	}
	
	
	}
}	 