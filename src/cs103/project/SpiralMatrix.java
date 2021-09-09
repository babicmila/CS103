package cs103.project;

import java.util.ArrayList;
import java.util.List;

/**
 * Data je m x n matrica, vratiti sve elemente matrice u spiralnom poretku
 */
public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;
        List<Integer> newMatrix = new ArrayList<>();
        int size = newMatrix.size();

        int upBoundary = 0;
        int downBoundary = rows - 1;
        int leftBoundary = 0;
        int rightBoundary = columns - 1;

        while (size < rows * columns) {

        }

        return newMatrix;
    }

}
