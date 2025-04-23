import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Spider extends Actor
{
    
    public void act()
    {
         move(-100);
        
        if(getX() <= 0) {
            resetSpider();
        }
        
        if (isTouching(Hero.class)){
            Skeleton skeleton = new Skeleton();
            getWorld().addObject(skeleton, 300, 200);
            getWorld().removeObject(this);
        }
    }
    public void resetSpider(){
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0) {
            setLocation(600, 100);
        } else {
            setLocation(600, 300);
        }
    }
}
