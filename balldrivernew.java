public class balldrivernew
{
	 public static void main(String[] args)
	 {
		 GameArena area= new GameArena(500,500);
		 Ball apple = new Ball(400,0,25,"pink");
		 area.addBall(apple); 
		 int xspeed =5;
		 int yspeed =10;
		 double x = 0;
		 double y = 0;
		 while (true)
		 {
			 area.pause();
			 apple.setYPosition(y);
			 y = y + yspeed;
			 if(y > 487)
			 {
			   yspeed= -10;
			   
		     }
			 else if (y<=0)
			 {
				 yspeed =10;
				 
			 }
		    
			
			apple.setXPosition(x);
			x = x+xspeed;
		    if(x>487)
			 {
		    	xspeed = -50;
		     }
			else if (x<=0)
			{
				xspeed= 5;
			}
			
		 }
		 
		 
	 }
	
	
	
	
}