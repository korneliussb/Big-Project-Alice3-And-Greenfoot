import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apel extends Objek
{
    /**
     * Act - do whatever the Apel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
          private int timer=0; 
          public void act() //method act
          {  
              setLocation(getX(), getY()+6); //posisi objek Apel, kecepatan Apel = +6
              ApelFall(); //lakukan method ApelFall
          }
          public void ApelFall() //method ApelFall
          { 
              if (atWorldEdge()) //jika objek Apel berada di bawah world
              {
                  getWorld().removeObject(this); // remove objek Apel
                  Greenfoot.playSound("bananafall.wav"); // mainkan sound bananafall.wav
              } 
            }
}