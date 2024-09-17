import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Banana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banana extends Actor
{
    /**
     * Act - do whatever the Banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int points = 0;
    public void act()
    {
         move(-10); 
        
        if(getX() <= 0)
        {
            resetEnemy(); 
        }
        
        if(isTouching(Hero.class))
        {
            GameOver gameOver = new GameOver();
            getWorld().addObject(gameOver, 300, 200);
            getWorld().removeObject(this);
            
        }
    }
    
    public void resetEnemy()
    {
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0)
        {
            setLocation(600,100);
            addPoint();
            System.out.println(points);
        }
        else
        {
            setLocation(600, 300); 
            addPoint();
            System.out.println(points);
        }
    }
    
    public void addPoint()
    {
       points++;
    }
}
