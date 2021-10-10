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
		form.fillOval(upperX, upperY, 2 * this.radius, 2 * this.radius );
	}

    
    public double getArea(){
		return Math.PI * (double)(this.radius * this.radius);
	}
    
    public Color getColor(){
		return this.shapeColor;
	}

    //getters
	public int getX(){
		return this.upperX;
	}

	public int getY(){
		return this.upperY;
	}

    public String getShapeName(){
        return "circle";
    }

	//setters
	public void setCord(int x, int y){
		this.upperX = x;
		this.upperY = y;
	}


    
}
