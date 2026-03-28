// Program to print the number from 1 to n.
import java.util.*;
public class Print1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int n = sc.nextInt();
        int i = 1;
        System.out.println("The numbers are : ");
        while(i <= n){
            System.out.println(i);
            i++;
        }
    }
}
