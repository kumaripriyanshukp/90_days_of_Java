// Program to check whether the number is positive or negative.
import java.util.*;
public class PositiveOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        if(num == 0){
            System.out.println("Number is neither positive nor negative.");
        }
        else if(num > 0){
            System.out.println("Number is positive.");
        }
        else{
            System.out.println("Number is negative.");
        }
    }
}
