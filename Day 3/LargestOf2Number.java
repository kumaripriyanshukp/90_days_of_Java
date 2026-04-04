// Program to print the largest of two numbers.
import java.util.*;
public class LargestOf2Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        if(num1 > num2){
            System.out.println("The largest number : " + num1);
        }
        else{
            System.out.println("The largest number : " + num2);
        }
    }
}
