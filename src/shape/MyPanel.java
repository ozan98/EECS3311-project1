package shape;


import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;


public class MyPanel extends JPanel implements ActionListener {

   private JButton loadButton;
   private JButton sortButton;
   private ShapeFactory shapes = new ShapeFactory();
   private static MyPanel panel = new MyPanel();
   

   private MyPanel(){
      
      JFrame frame = new JFrame("Sorting Shapes");
      loadButton = new JButton("Load");
      loadButton.setBounds(200, 10, 100, 25);
      loadButton.addActionListener(this);
      frame.add(loadButton);

      sortButton = new JButton("Sort");
      sortButton.setBounds(300, 10, 100, 25);
      sortButton.addActionListener(this);
      frame.add(sortButton);
      

      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(this);
      frame.setSize(600, 600);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
   }
   
   public static MyPanel getIntance(){
      return panel;
   }

   
	
	/**
	 * This method displays the created shapes.
	 */
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Graphics2D g2d = (Graphics2D) g;
      
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
         
         System.out.println("new shapes");
         for(Shape shape: shapes.getShapeList()){
            System.out.println(shape.getArea() + " " + shape.getShapeName());
         }
         System.out.println("~~~~~~~~~~~~~~~~~~~~~");
         repaint();
      }
      if(e.getSource() == sortButton){
         shapes.sortShapes();
         repaint();
         System.out.println("sorted shapes");
         for(Shape shape: shapes.getShapeList()){
            System.out.println(shape.getArea() + " " + shape.getShapeName());
         }
         
         

      }
      
   }
}
