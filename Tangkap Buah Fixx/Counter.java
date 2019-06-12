import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 //untuk pengaturan warna
/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */ 
    private int totalCount = 0; // Counter default awal = 0
    public void act() //method act
    {
       gameOver(); //method gameOver
    } 
    public Counter() //kelas Counter
    {
        setImage(new GreenfootImage("0", 30, Color.PINK, Color.BLUE)); //membuat tampilan counter dengan ukuran awal 30, tulisan warna putih, backgroun hitam
    }
    public void Counting (int hitung) // method Counting
    {
        totalCount += hitung; 
        setImage(new GreenfootImage("" + totalCount, 30, Color.PINK, Color.BLUE)); //membuat tampilan perubahan counter dengan ukuran awal 30, tulisan warna putih, backgroun hitam
      
    }
    public void gameOver() //method gameOver
    {
          if (totalCount >= 500) //bila totalCount >= 50
        {
            Greenfoot.stop();  // stop permainan
            Greenfoot.playSound("tada.wav"); //mainkan sound tada.wav
            System.out.println("Click RESET to play again"); //tampilkan tulisan ini
        } 
        
        else if (totalCount < 0) //bila totalCount >= 50
        {
            Greenfoot.stop();  // stop permainan
            Greenfoot.playSound("boom.wav"); //mainkan sound tada.wav
            System.out.println("Click RESET to play again"); //tampilkan tulisan ini
        } 
    }
}
