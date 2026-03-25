import java.util.*;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the degree in Fahrenheit : ");
        float deg = sc.nextFloat();
        float celsius = (deg-32)*5/9;
        System.out.println("The degree in Celsius : " + celsius);
    }
}
