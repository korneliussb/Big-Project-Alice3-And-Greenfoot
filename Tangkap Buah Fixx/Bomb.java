import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Objek
{
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY()+5); 
        Bombing();
    }    
    public void Bombing() //method Bombing
    {
        if (canSee(Monkey.class)) //bila melihat kelas Monkey
        {
            ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(-1); //kelas Count dikurangi sebanyak 1 poin
            Greenfoot.playSound("boom.wav"); //Mainkan sound boom.wav
        }
         if (atWorldEdge())  //bila objek berada di bawah world
        {
            getWorld().removeObject(this); //remove object
        }  
    }
}
