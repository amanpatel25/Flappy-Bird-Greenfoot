import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flappy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flappy extends Actor
{
    double dy = -15;
    double g = 0.8;
    double boost_speed = -7;
    /**
     * Act - do whatever the Flappy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
       
       if (getOneIntersectingObject(BottomPipe.class) != null) {
           displayGameOver();
        }
        if (getOneIntersectingObject(TopPipe.class) != null) {
           displayGameOver();
        }
       
        setLocation(getX(), (int)(getY() + dy));
       
       if (Greenfoot.isKeyDown("Up") == true) {
           dy = boost_speed;
       }
        
       if (getY() > getWorld().getHeight()) {
            displayGameOver();
       }
        
       dy = dy + g;
       
    }    
    private void displayGameOver() {
        GameOver gameOver = new GameOver();
        getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
        Greenfoot.stop();
        }
}
