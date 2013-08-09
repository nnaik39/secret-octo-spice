import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1 extends Actor
{ boolean facingLeft = false;
    int playerNumber = 0;
    int delay = 0;
    
    /**
     * Act - do whatever the Player1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public Player1(int player)
    {
        playerNumber = player;
        getImage().scale(70, 80);
    }

    public void act() 
    {
        checkKeys();
        checkFireKey();
    }    

    public void checkKeys()
    {
        String upKey = "up";
        if (playerNumber == 2) {
            upKey = "w";
        }
        String downKey = "down";
        if (playerNumber == 2) {
            downKey = "s";
        }
        String leftKey = "left";
        if (playerNumber == 2) {
            leftKey = "a";
        }
        String rightKey = "right";
        if (playerNumber == 2) {
            rightKey = "d";
        }
        if (Greenfoot.isKeyDown(upKey)) {
            setLocation(getX(), getY() - 5);
        }
        if (Greenfoot.isKeyDown(downKey)) {
            setLocation(getX(), getY() + 5);
        }
        if (Greenfoot.isKeyDown(leftKey)) {
            if (facingLeft) {
                setLocation(getX() - 5, getY());
            }
            else {
                getImage().mirrorHorizontally();
                facingLeft = true;
            }
        }
        if (Greenfoot.isKeyDown(rightKey)) {
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
        if (delay > 0) {
            delay = delay - 1;
        }
        String fireKey = "space";
        if (playerNumber == 2) {
            fireKey = "q";
        }
        if (Greenfoot.isKeyDown(fireKey) && delay == 0) {
            Fire();
        }
    }

    public void Fire()
    {
        delay = 25;
        Projectile projectile = new Projectile();
        getWorld().addObject(projectile, getX(), getY());
        if (facingLeft) {
            projectile.turn(180);
            projectile.getImage().mirrorVertically();
        }
    }
}