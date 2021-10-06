package shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShapeFactory {
    private List<Shape> shapeList;
    private int numOfShapes = 3;
    private Random randShape;
    public ShapeFactory(){
        randShape = new Random();
        shapeList = new ArrayList<Shape>();
        createShapes();
    }


    private void createShapes(){
        int shapeIdentity;
        for (int i = 0; i < 6; i++){
            shapeIdentity = randShape.nextInt(numOfShapes);
            if(shapeIdentity == 0){
                shapeList.add(new MyRectangle());
            }else if(shapeIdentity == 1){
                shapeList.add(new MyCircle());
            }else{
                shapeList.add(new MySquare());
            }
        }
    }
    public List<Shape> getShapeList(){
        return this.shapeList;
    }
    
}
