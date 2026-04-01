// Program to print the average of elements an array.
import java.util.*;
public class AverageOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of an array: ");
        int []arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = (sum + arr[i]);
        }
        int avg = sum/arr.length;
        System.out.println("The average of the elements of an array : " + avg);
    }
}
