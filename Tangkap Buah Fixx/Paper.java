import greenfoot.*;  // import World, Actor, GreenfootImage, Greenfoot

/**
 * Write a description of class Paper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Paper extends World
{

    /**
     * Constructor untuk objects dari class Paper.
     */
    public Paper()
    {    
        // Buat world dengan ukuran 720x480 cells dengan cell size 1x1 pixels
        super(683, 384, 1);
        BananaAppear(); //method BananaAppear
        prepare(); //method prepare
        BombAppear(); //method BombAppear
    }
    public void act() //method act
    {
        if (getObjects(Banana.class).isEmpty()) BananaAppear();
        if (getObjects(Bomb.class).isEmpty()) BombAppear();
    }
    private void prepare() //method prepare untuk menentukan posisi dari kelas objek masing-masing
    {
        Monkey monkey = new Monkey(); //penangkap
        addObject(monkey, 648, 403);
        Counter counter = new Counter(); //penghitung score
        addObject(counter, 57, 69);
        Score score = new Score();
        addObject(score, 64, 44);
        score.setLocation(59, 44);
        monkey.setLocation(373, 350);
    }
    public void BananaAppear() //method BananaAppear, buah apel
    {   
        if(Greenfoot.getRandomNumber(2) < 50) 
        {  
            addObject(new Banana(), Greenfoot.getRandomNumber(519),20);  
            
        } 
    }

    public void  BombAppear() //method BombAppear, buah busuk
    {
         if(Greenfoot.getRandomNumber(2) < 50) 
        {  
            addObject(new Bomb(), Greenfoot.getRandomNumber(519),21);   
        } 
    }
}
