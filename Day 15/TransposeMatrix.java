// Program to print the transpose of matrix.
import java.util.*;
public class TransposeMatrix {
    public static void main(String[] args) {
        int [][]mat = {{2,3,7},{5,6,7}};
        int row = 2, col = 3;

        printMatrix(mat);

        int [][]transpose = new int[col][row];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                transpose[j][i] = mat[i][j];
            }
        }
        printMatrix(transpose);
    }
    public static void printMatrix(int [][]mat){
        System.out.println("the matrix is : ");
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
