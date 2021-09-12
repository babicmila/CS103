package cs103.project;

import java.util.ArrayList;
import java.util.List;

/**
 * Data je m x n matrica, vratiti sve elemente matrice u spiralnom poretku
 */
public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> elements = new ArrayList<>();

        if (matrix == null || matrix.length == 0) {
            return elements;
        }

        int rows = matrix.length;
        int columns = matrix[0].length;
        int matrixSize = matrix.length * matrix[0].length;
        int arraySize = elements.size();

        int topBoundary = 0;
        int downBoundary = rows - 1;
        int leftBoundary = 0;
        int rightBoundary = columns - 1;

        while (topBoundary <= downBoundary && leftBoundary <= rightBoundary) {

            for (int i = leftBoundary; i <= rightBoundary; i++) {
                elements.add(matrix[topBoundary][i]);
            }
            topBoundary++;

            for (int i = topBoundary; i <= downBoundary; i++) {
                elements.add(matrix[i][rightBoundary]);
            }

            rightBoundary--;

            if (topBoundary <= downBoundary) {

                for (int i = rightBoundary; i >= leftBoundary; i--) {
                    elements.add(matrix[downBoundary][i]);
                }

                downBoundary--;
            }
            
            if(leftBoundary <= rightBoundary){
                
                for(int i = downBoundary; i>=topBoundary; i--){
                    elements.add(matrix[i][leftBoundary]);
                }
                leftBoundary++;
            }
            
        }
        return elements;
    }

}
