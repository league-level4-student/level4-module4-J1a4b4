package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    
    Polymorph(int x, int y){
   	 this.x = x;
   	 this.y = y;
    }
    
    public abstract void update();
    
    public int getX() {
    	return x;
    }
    
    public int getY() {
    	return y;
    }
    
    public void setX(int n) {
    	x = n;
    }
    
    public void setY(int n) {
    	y = n;
    }
    
    public abstract void draw(Graphics g);
}
