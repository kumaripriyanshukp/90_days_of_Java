// Program to count the even and odd elements in an array.
import java.sql.SQLOutput;
import java.util.*;
public class EvenOrOdd {
    public static void countEvenAndOdd(int []arr){
        int even_count = 0;
        int odd_count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]%2 == 0){
                even_count++;
            }
            else{
                odd_count++;
            }
        }

        System.out.println("The count of even elements : " + even_count);
        System.out.println("The count of odd elements : " + odd_count);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of an array : ");
        int []arr = new int[6];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        countEvenAndOdd(arr);
    }
}
