import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monkey here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Monkey extends Objek
{
    /**
     * Act - do whatever the Monkey wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() //method act
   
    {
        moveMonkey(); //method moveMonkey
        objectDisappear(); //method objectDisappear
    } 
     public void objectDisappear() //method objectDisappear
    {
       if (canSee(Banana.class)) //bila melihat kelas objek banana
       {
           eat(Banana.class); //eat kelas objek banana
           ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(10); // kelas counter ditambah sebanyak 10 poin
           Greenfoot.playSound("score.wav"); // mainkan sound score.wav
       }
      
    }
    public void moveMonkey() //method moveMonkey
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
