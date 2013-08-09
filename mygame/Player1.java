import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1 extends Actor
{ boolean facingLeft = false;
    /**
     * Act - do whatever the Player1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public Player1()
    {
        getImage().scale(70, 80);
    }

    public void act() 
    {
        checkKeys();
        checkFireKey();
    }    

    public void checkKeys()
    {
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

    public void checkFireKey()
    {
        if ("space".equals(Greenfoot.getKey())) {
            Fire();
        }
    }

    public void Fire()
    {
        Projectile projectile = new Projectile();
        getWorld().addObject(projectile, getX(), getY());
        if (facingLeft) {
            projectile.turn(180);
            projectile.getImage().mirrorVertically();
        }
    }
}