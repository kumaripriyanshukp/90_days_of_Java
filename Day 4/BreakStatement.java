// Program to keep entering numbers till user enters a multiple of 10.
import java.util.*;
public class BreakStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        do{
            int num = sc.nextInt();
            if(num%10 == 0){
                break;
            }
            System.out.println(num);

        }while(true);
    }
}
