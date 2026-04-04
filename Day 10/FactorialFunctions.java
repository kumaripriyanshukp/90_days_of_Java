// Program to print the factorial using functions
import java.util.*;
public class FactorialFunctions{
    public static void printFactorial(int num){
        int fact = 1;
        while(num > 0){
            fact = fact * num;
            num--;
        }
        System.out.println("The factorial of a number : " + fact);
    }
    public static void main(String[] args) {
        int num = 5;
        printFactorial(num);
    }
}