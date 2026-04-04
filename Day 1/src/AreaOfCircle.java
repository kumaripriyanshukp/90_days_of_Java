// Program to find the area of a circle.
import java.util.*;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of a circle : ");
        float r = sc.nextFloat();
        float pi = 3.14f;
        float area = pi*r*r;
        System.out.println(area);
    }
}
