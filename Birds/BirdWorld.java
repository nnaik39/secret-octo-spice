import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BirdWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BirdWorld extends World
{

    /**
     * Constructor for objects of class BirdWorld.
     * 
     */
    public BirdWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setPaintOrder(new Class[] {Bird.class, Poop.class});

        prepare();
    }

    public void act()
    {
        if (Greenfoot.getRandomNumber(100) == 0)
        {
            Person a = new Person();

            addObject(a, 0, Greenfoot.getRandomNumber(600));
        }
        if (Greenfoot.getRandomNumber(100) == 0)
        {
            Person a = new Person();

            addObject(a, Greenfoot.getRandomNumber(600), 0);

        }
        if (Greenfoot.getRandomNumber(100) == 0)
        {
            Person a = new Person();

            addObject(a, 595, Greenfoot.getRandomNumber(600));
        }
        if (Greenfoot.getRandomNumber(100) == 0)
        {
            Person a = new Person();
            addObject(a, Greenfoot.getRandomNumber(600), 595);
        }
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Bird bird = new Bird();
        addObject(bird, 297, 231);
    }
}