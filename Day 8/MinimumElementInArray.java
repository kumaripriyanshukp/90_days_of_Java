// Program to print the minimum element in an array.
import java.util.*;
public class MinimumElementInArray {
    public static int minimumElement(int []arr){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of an array: ");
        int []arr = new int[7];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The minimum element in an array : " +minimumElement(arr));
    }
}
