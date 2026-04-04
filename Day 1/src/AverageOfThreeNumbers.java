// Program to print the average of three subjects marks
import java.util.*;
public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of three subjects : ");
        float math = sc.nextFloat();
        float eng = sc.nextFloat();
        float hindi = sc.nextFloat();
        float avg = (math+eng+hindi)/3;
        System.out.println("The average of three numbers : " + avg);
    }
}
