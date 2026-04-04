// Program to calculate the bill
import java.util.*;
public class Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of pen, pencil and eraser : ");
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pen+pencil+eraser;
        float bill = total + (total*0.18f);
        System.out.println("The bill is : " + bill);

    }
}
