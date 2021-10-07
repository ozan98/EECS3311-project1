package shape;

import java.awt.Color;
import java.awt.Graphics;


public class MyCircle implements Comparable <Shape>, Shape{

    private int upperX;
    private int upperY;
    private int radius;
    private Color shapeColor;

    public MyCircle (int upperX, int upperY, int radius, Color shapeColor){
        this.upperX = upperX;
        this.upperY = upperY;
        this.radius = radius;
        this.shapeColor = shapeColor;
    }

    @Override
    public int compareTo(Shape o){
        if(this.getArea() > o.getArea()){
			return 1;
		}
		if(this.getArea() < o.getArea()){
			return -1;
		}
		return 0;
    }

    /**
	 * Method to draw a circle
	 * @param form
	 */
	public  void drawShape(Graphics	form) {
        int newX = this.upperX - (this.radius / 2);
        int newY = this.upperY - (this.radius / 2);
        
		form.fillOval(newX, newY, this.radius, this.radius);
	}

    
    public double getArea(){
		
		return Math.PI * (double)(this.radius * this.radius);
	}
    public Color getColor(){
		return this.shapeColor;
	}


    
}
