package cs103.project;

import java.util.ArrayList;
import java.util.List;

public class MatrixZeroes {

    int[][] matrix;
    int row = 0;
    int column = 0;
    List<Integer> rowIndexList = new ArrayList<>();
    List<Integer> columnIndexList = new ArrayList<>();

    public void setZeroes(int[][] matrix) {

        if (matrix == null) {
            return;
        }

        row = matrix.length;
        column = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                if (matrix[i][j] == 0) {
                    rowIndexList.add(i);
                    columnIndexList.add(j);
                }

            }
        }

        for (int l : rowIndexList) {
            for (int k = 0; k < column; k++) {
                matrix[l][k] = 0;
            }
        }

        for (int m = 0; m < row; m++) {
            for (int n : columnIndexList) {
                matrix[m][n] = 0;
            }
        }

        System.out.println(printMatrix(matrix));

    }

    public String printMatrix(int[][] matrixx) {

        StringBuffer buffer = new StringBuffer("");

        for (int i = 0; i < matrixx.length; i++) {
            for (int j = 0; j < matrixx[0].length; j++) {
                buffer.append(matrixx[i][j]);
            }
            buffer.append(System.getProperty("line.separator"));
        }
        return buffer.toString();
    }
}
