import greenfoot.*;  // import World, Actor, GreenfootImage, Greenfoot

/**
 * Write a description of class Hutan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hutan extends World
{

    /**
     * Constructor untuk objects dari class Hutan.
     */
    public Hutan()
    {    
        // Buat world dengan ukuran 720x480 cells dengan cell size 1x1 pixels
        super(683, 384, 1);
        ApelAppear(); //method ApelAppear
        prepare(); //method prepare
        BusukAppear(); //method BusukAppear
    }
    public void act() //method act
    {
        if (getObjects(Apel.class).isEmpty()) ApelAppear();
        if (getObjects(Busuk.class).isEmpty()) BusukAppear();
    }
    private void prepare() //method prepare untuk menentukan posisi dari kelas objek masing-masing
    {
        Landak Landak = new Landak(); //penangkap
        addObject(Landak, 648, 403);
        Counter counter = new Counter(); //penghitung score
        addObject(counter, 57, 69);
        Score score = new Score();
        addObject(score, 64, 44);
        score.setLocation(59, 44);
        Landak.setLocation(373, 350);
    }
    public void ApelAppear() //method ApelAppear, buah apel
    {   
        if(Greenfoot.getRandomNumber(2) < 50) 
        {  
            addObject(new Apel(), Greenfoot.getRandomNumber(519),20);  
            
        } 
    }

    public void  BusukAppear() //method BusukAppear, buah busuk
    {
        if(Greenfoot.getRandomNumber(2) < 50) 
        {  
            addObject(new Busuk(), Greenfoot.getRandomNumber(519),21);   
        } 
    }
}
