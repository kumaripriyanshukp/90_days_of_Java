// Program to print the maximum element in an array.
import java.util.*;
public class MaximumElementInArray {
    public static int maximumElement(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements in an array: ");
        int []arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The maximum element in an array : " + maximumElement(arr));
    }
}
