import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartScreen extends World
{

    /**
     * Constructor for objects of class StartScreen.
     * 
     */
    public StartScreen()
    {    
        super(683, 384, 1); //Ukuran World-nya
        prepare();
    }
    
    private void prepare()
    {
        Mulai mulai = new Mulai();
        addObject(mulai, 350, 200);
        
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
        Greenfoot.setWorld(new Hutan());
    }
}
