// Program to print the sum of digits of a number.
import java.util.*;
public class SumOfDigits {
    public static int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum = sum+rem;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("the sum of digits of a number : " +sumOfDigits(n));
    }
}
