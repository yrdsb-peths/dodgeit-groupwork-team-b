import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Applo extends Actor
{
    public void act()
    {
        move(-10);
        
        if(getX() <= 0)
        {
            resetApplo();
        }
        
        if(isTouching(Hero.class))
        {
            GameOver gameOver = new GameOver();
            getWorld().addObject(gameOver, 300, 200);
            getWorld().removeObject(this);
        }
        
    }
    public void resetApplo()
    {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0)
        {
            setLocation(600,100);
            
        }
        else
        {
            setLocation(600, 600); 
        }
    }
}
