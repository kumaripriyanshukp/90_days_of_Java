// Program to print the pyramid number pattern.
import java.util.*;
public class PyramidNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n umber of lines you want : ");
        int n = sc.nextInt();
        System.out.println("The pattern : ");
        for(int i = 1; i <= n; i++){
            for(int l = 1; l <= n-i; l++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            for(int k = i-1; k >= 1; k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
