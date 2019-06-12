import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Banana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banana extends Objek
{
    /**
     * Act - do whatever the Banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
          private int timer=0; 
          public void act() //method act
          {  
              setLocation(getX(), getY()+6); //posisi objek banana, kecepatan banana = +6
              BananaFall(); //lakukan method BananaFall
          }
          public void BananaFall() //method BananaFall
          { 
              if (atWorldEdge()) //jika objek banana berada di bawah world
              {
                  getWorld().removeObject(this); // remove objek banana
                  Greenfoot.playSound("bananafall.wav"); // mainkan sound bananafall.wav
              } 
            }
}