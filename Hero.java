import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class hero extends Actor
{
    public void act()
    {
        boolean atTop = true;
        
        if(Greenfoot.mouseClicked(null))
        {
            atTop = !atTop;
        }
        
        if(atTop)
        {
            setLocation(100, 100);
        }
        else
        {
            setLocation(100, 300);
        }
    }
}
