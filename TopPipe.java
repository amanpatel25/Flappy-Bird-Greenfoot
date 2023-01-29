import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TopPipe here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TopPipe extends Actor
{
    int pipe_speed = -4;
    /**
     * Act - do whatever the TopPipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation( getX() + pipe_speed, getY() );
    }    
}
