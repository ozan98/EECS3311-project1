package shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.awt.Color;

public class ShapeFactory {
    private List<Shape> shapeList;
    private int numOfShapes = 3;
    private Random randShape;
    private Random randDim;
    private Random randColor;
    private ShapeInsertionSort sortShape;


    public ShapeFactory(){
        randShape = new Random();
        randDim = new Random();
        randColor = new Random();
        shapeList = new ArrayList<Shape>();
        sortShape = new ShapeInsertionSort();
        // createShapes();
    }


    public void createShapes(){
        int shapeIdentity;
        int upperX = 20;
        int upperY = 20;
        int offSet = 60;
        
        for (int i = 0; i < 6; i++){
            shapeIdentity = randShape.nextInt(numOfShapes);
            if(shapeIdentity == 0){
                shapeList.add(new MyRectangle(upperX, upperY, setDim(), setDim(), setColor()));
            }else if(shapeIdentity == 1){
                shapeList.add(new MyCircle(upperX, upperY, setDim(), setColor()));
            }else{
                int squareDIM = setDim();
                shapeList.add(new MySquare(upperX, upperY, squareDIM, squareDIM, setColor()));
            }
            upperX += offSet;
            upperY += offSet;
        }
    }

    public List<Shape> getShapeList(){
        return this.shapeList;
    }
    
    public void resetShapes(){
        this.shapeList.clear();
    }

    public void sortShapes(){
        List<Shape> tempShapeList = new ArrayList<Shape>(this.shapeList);
        resetShapes();
        for (Shape shape : sortShape.sort(tempShapeList)){
            this.shapeList.add(shape);
        }
        

    }

    //helper methods
    private int setDim(){
        int upperBound = 50;
        int lowerBound = 20;

        return randDim.nextInt(upperBound - lowerBound) + lowerBound;
        
    }

    private Color setColor(){
        return new Color(randColor.nextInt(200), randColor.nextInt(200), randColor.nextInt(200));
    }



    
}
