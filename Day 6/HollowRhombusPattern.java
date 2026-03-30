// Program to print the hollow rhombus pattern.
import java.util.*;
public class HollowRhombusPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows and columns : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.println("The pattern : ");
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= (row-i); j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= col; k++){
                if(i == 1 || i == row || k == 1 || k == col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
