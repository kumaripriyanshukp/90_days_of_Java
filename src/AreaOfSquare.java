// Program to find the area of square.
import java.util.*;
public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of a square : ");
        float side = sc.nextFloat();
        float area = side * side;
        System.out.println("Area of square : " + area);
    }
}
