package shape;

import java.awt.Color;
import java.awt.Graphics;


public interface Shape{
     public double getArea();
     public Color getColor();
     public void drawShape(Graphics form);
     public int compareTo(Shape o);
     public int getX();
     public int getY();
     public void setCord(int x, int y);
     public String getShapeName();
}
