package shape;

import java.awt.Color;
import java.awt.Graphics;


public interface Shape{
     double getArea();
     Color getColor();
     void drawShape(Graphics form);
     int compareTo(Shape o);
     int getX();
     int getY();
     void setCord(int x, int y);
     String getShapeName();
}
