import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jumper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jumper extends Actor
{
    int speed = 0;
    /**
     * Act - do whatever the jumper wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkKeys;
        if (getY() < 364)
{
    {
       applyGravity(); 
    }    
    else {
        setLocation(getX(), 374);
    }
}
}
public void applyGravity()
{
    speed = speed + 1;
    setLocation(getX(), getY() + speed);
}
public void stickTOGround()
{
    setLocation(getX(), 374);
    
}
public void checkKeys()
{
    if (Greenfoot.isKeyDown
}
}
