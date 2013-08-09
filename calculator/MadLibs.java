
/**
 * MadLib generator!
 */

import java.util.Scanner;

public class MadLibs
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a main character: ");
        
        String mainCharacter = keyboard.nextLine();
        
        System.out.println("Enter a number: ");
        
        String number = keyboard.nextLine();
        
        System.out.println("Enter an evil character: ");
        
        String evilCharacter = keyboard.nextLine();
        
        System.out.println("Enter the effect of a spell: ");
        
        String spelleffect = keyboard.nextLine();
        
        System.out.println("Enter an emotion: ");
        
        String emotion = keyboard.nextLine();
        
        System.out.println("Once upon a time, there was a " + mainCharacter + ".");
        
        System.out.println("The " + mainCharacter + " had " + number + " baths per year.");
        
        System.out.println(" The evil " + evilCharacter + " hated the " + mainCharacter + ".");
        
        System.out.println("The " + evilCharacter + " cast a spell which made the " + mainCharacter + spelleffect + ".");
        
        System.out.println("The " + mainCharacter + " was " + emotion + "; he would never be the same again.");
    }
}
