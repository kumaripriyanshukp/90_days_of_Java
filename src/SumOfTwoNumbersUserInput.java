// Program to print the sum of two numbers where input is taken from the user
import java.util.*;
public class SumOfTwoNumbersUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum of two numbers : " + sum);
    }
}
