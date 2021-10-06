package shape;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MyCircle implements Comparable <Shape>, Shape{

    protected int x;
    protected int y;
    protected int r;
    protected Color shapeColor;

    public MyCircle (){
        Random rand = new Random();
        int upperBound = 200;
        this.x = rand.nextInt(upperBound);
        this.y = rand.nextInt(upperBound);
        this.r = rand.nextInt(upperBound);
        this.shapeColor = new Color(rand.nextInt(upperBound),
                                rand.nextInt(upperBound),
                                rand.nextInt(upperBound));
    }

    @Override
    public int compareTo(Shape o){
        //TODO write the right jave code here to support campareTO
        return 0;
    }

    /**
	 * Method to draw a circle
	 * @param form
	 */
	public  void drawShape(Graphics	form) {
        int newX = this.x - (this.r / 2);
        int newY = this.y - (this.r / 2);
        
		form.fillOval(newX, newY, this.r, this.r);
	}

    
    public double getArea(){
		
		return Math.PI * (double)(this.r * this.r);
	}
    public Color getColor(){
		return this.shapeColor;
	}


    
}
