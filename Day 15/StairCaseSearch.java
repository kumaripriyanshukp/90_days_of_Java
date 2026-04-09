// Program to find the key in sorted 2D array.
public class StairCaseSearch {
    public static boolean staircase(int [][]mat, int key){
        int row = 0;
        int col = mat.length-1;
        while(row < mat.length && col >= 0){
            if(mat[row][col] == key){
                System.out.println("key found at (" + row +", " + col +")");
                return true;
            }
            else if(key < mat[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("The key is not found!");
        return false;
    }
    public static void main(String[] args) {
        int [][]mat = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key = 33;
        staircase(mat, key);
    }
}
