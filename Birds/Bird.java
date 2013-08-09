import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bird is a bird.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bird extends Actor
{
    boolean facingLeft = false;
    public void act() 
    {
        checkKeys();
    }    

    public void checkKeys()
    {
        if ("space".equals(Greenfoot.getKey()) ){
            firePoop();
        }
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 5);
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 5);
        }
        if (Greenfoot.isKeyDown("left")) {
            if (facingLeft) {
                setLocation(getX() - 5, getY());
            }
            else {
                getImage().mirrorHorizontally();
                facingLeft = true;
            }
        }
        if (Greenfoot.isKeyDown("right")) {
            if (facingLeft) {
                getImage().mirrorHorizontally();
                facingLeft = false;
            }
            else {
                setLocation(getX() + 5, getY());
            }
        }
    }

    public void firePoop()
    {
        getWorld().addObject(new Poop(), getX(), getY());
    }
}
