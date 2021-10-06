package shape;

import java.awt.Color;
import java.awt.Graphics;


public interface Shape{
    
	 Color shapeColor = null;

     double getArea();
     Color getColor();
     void drawShape(Graphics form);
}
