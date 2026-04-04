// Program to print the butterfly pattern.
import java.util.*;
public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines you want : ");
        int n = sc.nextInt();
        System.out.println("The pattern : ");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int k = 1; k <= 2*(n-i); k++){
                System.out.print(" ");
            }
            for(int l = 1; l <= i; l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n-1; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int k = 1; k <= 2*(n-i); k++){
                System.out.print(" ");
            }
            for(int l = 1; l <= i; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
