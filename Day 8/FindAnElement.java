// Program to find an element in an array.
import java.util.*;
public class FindAnElement {
    public static int findElement(int []arr, int key){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of an array : ");
        int []arr = new int[5];
        int key = 5;
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The index of the element in an array: " + findElement(arr,key));
    }
}
