// Program to convert Inches to meters
import java.util.*;
public class InchesToMeters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in inches : ");
        float inches = sc.nextFloat();
        float meters = inches * 0.0254f;
        System.out.println("The numbers in meters : " +meters);

    }
}
