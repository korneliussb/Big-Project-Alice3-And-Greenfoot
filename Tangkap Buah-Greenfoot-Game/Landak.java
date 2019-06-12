import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Landak here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Landak extends Objek
{
    /**
     * Act - do whatever the Landak wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() //method act
   
    {
        moveLandak(); //method moveLandak
        objectDisappear(); //method objectDisappear
    } 
     public void objectDisappear() //method objectDisappear
    {
       if (canSee(Apel.class)) //bila melihat kelas objek apel
       {
           eat(Apel.class); //eat kelas objek apel
           ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(10); // kelas counter ditambah sebanyak 10 poin
           Greenfoot.playSound("score.wav"); // mainkan sound score.wav
       }
      
    }
    public void moveLandak() //method moveLandak
    {
          if (Greenfoot.isKeyDown("left")) //bila arah panah ke kiri ditekan
        {
            move(-7); //bergerak ke -7
            
            //getImage().mirrorHorizontally(); 
        }
        if (Greenfoot.isKeyDown("right")) //bila arah panah ke kanan ditekan
        {
           move(7); //bergerak ke 7
          
           //getImage().mirrorHorizontally(); 
        }
    }
}
