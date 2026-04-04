// Program to print hour glass pattern.
import java.util.*;
public class HourGlassPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines you want : ");
        int n = sc.nextInt();
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            for(int l = 2; l <= i; l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 2; i <= n; i++){
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            for(int l = 2; l <= i; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
