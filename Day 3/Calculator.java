// Program to create a calculator.
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter the operator (-,+,/,*,%) : ");
        char operator = sc.next().charAt(0);
        switch(operator){
            case '+' -> System.out.println(num1 + num2);
            case '-' -> System.out.println(num1 - num2);
            case '*' -> System.out.println(num1 * num2);
            case '/' -> System.out.println(num1 / num2);
            case '%' -> System.out.println(num1 % num2);
            default -> System.out.println("Invalid operators!");
        }

    }
}
