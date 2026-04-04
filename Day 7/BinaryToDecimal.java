// Program to convert binary to decimal.
import java.util.*;
public class BinaryToDecimal {
    public static void binToDec(int n){
        int dec = 0;
        int pow = 0;
        while(n > 0){
            int rem = n%10;
            dec = dec + (rem*(int)Math.pow(2,pow));
            pow++;
            n = n/10;
        }
        System.out.println("The Decimal number is : " + dec);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        binToDec(n);
    }
}
