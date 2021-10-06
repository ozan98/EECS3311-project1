package shape;


import java.awt.Color;
import java.awt.Graphics;

public class MySquare implements Comparable <Shape>, Shape {
    private int upperX; 
	private int upperY;
	private int width;
	private int height;
	private Color shapeColor;

    public MySquare(int upperX, int upperY, int width, int height, Color shapeColor){
        this.upperX = upperX;
        this.upperY = upperY;
        this.width = width;
        this.height = height;
        this.shapeColor = shapeColor;
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
