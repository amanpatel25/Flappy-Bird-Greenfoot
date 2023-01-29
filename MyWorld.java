import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int pipecounter = 0;
    int flappycounter=0;
    int pipe_spacing = 160;
    int score = 0;
    int first_pipe = 236;
    Score scoreObj = null;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        setPaintOrder(YouWin.class,GameOver.class,Score.class,Flappy.class,TopPipe.class,BottomPipe.class);
        Flappy flappy = new Flappy();
        addObject(flappy, 100, getHeight()/2);
        scoreObj = new Score();
        scoreObj.setScore(0);
        addObject(scoreObj, 100, 100);
    }
    
    public void act() {
        if (pipecounter == 0) {
            showText("Press UP key to jump.... You WIN when you get 10 points",getWidth()/2, getHeight()/2 + 40);
            Greenfoot.delay(300);
        }
        else {
            showText("", getWidth()/2, getHeight()/2 + 40);
        }
        pipecounter++;
        //System.out.println(counter);
        if (pipecounter % 100 == 0) {
            createpipe();
            
        }
        
        if (pipecounter >= first_pipe) {
            if (flappycounter % 100 == 0) {
                score++;
                scoreObj.setScore(score);
            }
            flappycounter++;
        }
        youWin();
    }
    public void youWin() {
        if (score == 10) {
            addObject(new YouWin(), getWidth()/2, getHeight()/2);
            Greenfoot.stop();
        }
    }
    private void createpipe() {
        BottomPipe btmpipe = new BottomPipe();
        GreenfootImage image1 = btmpipe.getImage();
        addObject(btmpipe, getWidth(), getHeight()/2 + image1.getHeight()/2 + Greenfoot.getRandomNumber(150));
        TopPipe toppipe = new TopPipe();
        GreenfootImage image2 = toppipe.getImage();
        addObject(toppipe, btmpipe.getX(), btmpipe.getY()-toppipe.getImage().getHeight()-pipe_spacing);
        }
}
