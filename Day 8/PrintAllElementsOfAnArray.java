// Program to print all the values of an array.
import java.util.*;
public class PrintAllElementsOfAnArray {
    public static void allElements(int []arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of an array : ");
        int []arr = new int[9];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        allElements(arr);
    }
}
