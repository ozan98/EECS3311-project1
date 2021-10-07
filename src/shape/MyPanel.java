package shape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;

public class MyPanel extends JPanel implements ActionListener {

   JButton loadButton;
   ShapeFactory shapes = new ShapeFactory();

   MyPanel(){
      
      JFrame frame = new JFrame("Display two shapes (rectangles)");
      loadButton = new JButton("Load");
      loadButton.setBounds(200, 10, 100, 25);
      loadButton.addActionListener(this);
      frame.add(loadButton);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(this);
      frame.setSize(600, 600);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }

   
	
	
	// private List<Shape> createTwoRectangles(){
   //    ShapeFactory shapes = new ShapeFactory();
	// 	return shapes.getShapeList();
	// }

   
	
	/**
	 * This method displays the created shapes.
	 */
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Graphics2D g2d = (Graphics2D) g;

      //calling the method that creates two shapes (rectangles)
      // List<Shape> shapeList = createTwoRectangles();
      // shapes.getShapeList();
      
      for (Shape shape: shapes.getShapeList()) {
    	  g2d.setColor(shape.getColor());
    	  shape.drawShape(g2d);
      }
   } 
   
   /**
    * This is the main method of the class.
    * @param args
    */
   public static void main(String[] args) {
      new MyPanel();
     
   }


   @Override
   public void actionPerformed(ActionEvent e) {
      if(e.getSource() == loadButton){
         shapes.resetShapes();
         shapes.createShapes();
         repaint();
      }
      
   }
}
