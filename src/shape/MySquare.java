package shape;

import java.util.Random;
import java.awt.Color;
import java.awt.Graphics;

public class MySquare implements Comparable <Shape>, Shape {
     int upperX; 
	 int upperY;
	 int width;
	 int height;
	 Color shapeColor;

    public MySquare(){
        Random rand = new Random();
        int upperBound = 200;
        this.upperX = rand.nextInt(upperBound);
        this.upperY = rand.nextInt(upperBound);
        this.width = rand.nextInt(upperBound);
        this.height = this.width; 
        shapeColor = new Color(rand.nextInt(upperBound),
                                rand.nextInt(upperBound),
                                rand.nextInt(upperBound));
    }

    @Override
    public int compareTo(Shape o){
        return 0;
    }

    /**
	 * Method to draw a circle
	 * @param form
	 */
	public  void drawShape(Graphics	form) {
        form.fillRect(upperX, upperY, width, height);
	}

    public double getArea(){
		return (double) width * (double) height;
	}
    public Color getColor(){
		return this.shapeColor;
	}
}
