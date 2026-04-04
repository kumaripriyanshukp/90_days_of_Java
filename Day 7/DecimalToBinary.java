// Program to convert decimal number to binary.
import java.util.*;
public class DecimalToBinary {
    public static void decToBin(int n){
        int bin = 0;
        int pow = 0;
        while(n > 0){
            int rem = n%2;
            bin = bin + (rem*(int)Math.pow(10,pow));
            pow++;
            n = n/2;
        }
        System.out.println("The Decimal number is : " + bin);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        decToBin(n);
    }
}
