// Program to print inverted and rotated half pyramid.
import java.util.*;
public class InvertedAndRotatedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines you want : ");
        int n = sc.nextInt();
        System.out.println("The pattern : ");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
