// Program to print the spiral matrix.
public class SpiralMatrix {
    public static void spiralMatrix(int [][]mat){
        int startRow = 0;
        int startCol = 0;
        int endRow = mat.length-1;
        int endCol = mat[0].length -1;

        while(startRow <= endRow && startCol <= endCol){
            //Top
            for(int i = startCol; i <= endCol; i++){
                System.out.print(mat[startRow][i] + " ");
            }

            //Right
            for(int j = startRow+1; j <= endRow; j++){
                System.out.print(mat[j][endCol] +" ");
            }

            //Bottom
            for(int l = endCol-1; l >= startCol; l--){
                if(startRow == endRow){
                    break;
                }
                System.out.print(mat[endRow][l] +" ");
            }

            //Left
            for(int k = endRow-1; k >= startRow+1; k--){
                if(startCol == endCol){
                    break;
                }
                System.out.print(mat[k][startCol]+ " ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }
    public static void main(String[] args) {
        int [][]mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiralMatrix(mat);
    }
}
