package shape;


import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;



public class MyRectangle implements Comparable <Shape>, Shape{

	protected int upperX; 
	protected int upperY;
	protected int width;
	protected int height;
	protected Color shapeColor;
	
	/**
	 * Class's constructor
	 * @param upperX
	 * @param upperY
	 * @param width
	 * @param height
	 * @param shapeColor
	 */
	public MyRectangle () {
		Random rand = new Random();
        int upperBound = 200;
		this.upperX = rand.nextInt(upperBound);
		this.upperY = rand.nextInt(upperBound);
		this.width = rand.nextInt(upperBound);
		this.height = rand.nextInt(upperBound);
		this.shapeColor = new Color(rand.nextInt(upperBound),
                                rand.nextInt(upperBound),
                                rand.nextInt(upperBound));
	}
	


	@Override
	public int compareTo(Shape o) {
		// TODO write the right Java code here to support the comparison
		return 0;
	}
	
	/**
	 * Method to draw a rectangle
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
