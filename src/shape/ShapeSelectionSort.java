package shape;

import java.util.Collections;
import java.util.List;

public class ShapeSelectionSort {
    

    public ShapeSelectionSort(){
        
    }

    public List<Shape> sort(List<Shape> arr){
        int tempX;
        int tempY;
        for(int j = 0; j < arr.size() - 1; j++){
            int iMin = arr.indexOf(arr.get(j));
            for(int i = j + 1; i < arr.size(); i++){
                if(arr.get(i).compareTo(arr.get(iMin)) == -1){
                    iMin = i;
                }
            }
            if(iMin != j){
                tempX = arr.get(j).getX();
                tempY = arr.get(j).getY();

                arr.get(j).setCord(arr.get(iMin).getX(), arr.get(iMin).getY());
                arr.get(iMin).setCord(tempX, tempY);
                
                Collections.swap(arr, arr.indexOf(arr.get(j)), arr.indexOf(arr.get(iMin)));                
            }

        }

        return arr;

    }

}
