// Program to print the product of two numbers
import java.util.*;
public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a*b;
        System.out.println("The product of two numbers : " +product);
    }
}
