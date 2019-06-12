import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 //import ini untuk mengatur warna
public class Counter extends Actor
{
    private int totalCount = 0; // Memberi nilai default Counter awalnya = 0
    public void act() //method act
    {
       gameOver(); //method gameOver
    } 
    public Counter() //kelas Counter
    {
        setImage(new GreenfootImage("0", 30, Color.PINK, Color.BLUE)); 
        //mengatur tampilan counter dengan ukuran awal 30, tulisan warna pink, background biru
    }
    public void Counting (int hitung) // method Counting
    {
        totalCount += hitung; 
        setImage(new GreenfootImage("" + totalCount, 30, Color.PINK, Color.BLUE)); 
        //mengatur tampilan perubahan counter dengan ukuran awal 30, tulisan warna pink, background biru
      
    }
    public void gameOver() //method gameOver
    {
          if (totalCount >= 50) //bila totalCount >= 500
        {
            //Greenfoot.stop(); // stop permainan
            Greenfoot.playSound("tada.wav"); //mainkan sound tada.wav
            Greenfoot.setWorld(new GameOverScreen());
            //System.out.println("Anda MENANG, Klik RESET untuk Main Lagi"); //menampilkan tulisan ini
        } 
        
        else if (totalCount < 0) //bila totalCount < 0
        {
            //Greenfoot.stop();  // stop permainan
            Greenfoot.playSound("boom.wav"); //mainkan sound boom.wav
            Greenfoot.setWorld(new LostScreen());
            //System.out.println("Anda KALAH, Klik RESET untuk Main Lagi"); //menampilkan tulisan ini
        } 
    }
}
