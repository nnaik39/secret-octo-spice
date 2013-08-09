import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JumpWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JumpWorld extends World
{

    /**
     * Constructor for objects of class JumpWorld.
     * 
     */
    public JumpWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        jumper jumper = new jumper();
        addObject(jumper, 252, 371);
        jumper.setLocation(283, 369);
        jumper.setLocation(281, 392);
        jumper.setLocation(283, 379);
    }
}
