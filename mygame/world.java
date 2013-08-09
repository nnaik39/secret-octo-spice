import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class world here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class world extends World
{
    Player1 baby1;
    Player1 baby2;
    /**
     * Constructor for objects of class world.
     * 
     */
    public world()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
    }

    private void prepare()
    {
        baby1 = new Player1(1);
        addObject(baby1, 279, 176);
        baby2 = new Player1(2);
        addObject(baby2, 278, 309);
        baby1.setLocation(289, 99);
    }

    public Player1 getRandomBaby() {
        if (Greenfoot.getRandomNumber(2) == 0) {
            return baby1;
        }
        else {
            return baby2;
        }
    }
}
