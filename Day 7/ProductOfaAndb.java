// Program to print the product of a and b.
import java.util.*;
public class ProductOfaAndb {
    public static int product(int a, int b){
        int prod = a*b;
        return prod;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The product of a and b " +product(a,b));
    }
}
