// Program to print the sum of elements of an array.
import java.util.*;
public class SumOfElements {
    public static int sumOfElements(int []arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of an array: ");
        int []arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The sum of all elements of an array : " +sumOfElements(arr));
    }
}
