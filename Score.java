import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    public Score() {
        GreenfootImage newImage = new GreenfootImage(100, 50);
        setImage(newImage);
    }
    
    public void setScore(int score) {
        GreenfootImage newImage = getImage();
        newImage.clear();
        
        Color c = new Color(127, 127, 127, 127);
        newImage.setColor(c);
        newImage.fill();
        newImage.setColor(Color.WHITE);
        newImage.drawString("" + score, 50, 30);
        setImage(newImage);
    }
}
