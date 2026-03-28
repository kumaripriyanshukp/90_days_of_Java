// Program to print the square pattern.
import java.util.*;
public class PrintSquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        for(int i = 1; i <= n; i++){
            System.out.println("****");
        }
    }
}
