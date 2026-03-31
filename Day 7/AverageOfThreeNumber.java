// Program to find the average of three numbers.
import java.util.*;
public class AverageOfThreeNumber {
    public static float avgOfNumber(int num1, int num2, int num3){
        float avg = (num1+num2+num3)/3;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any three number : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println("The average of three number : " + avgOfNumber(num1, num2, num3));
    }
}
