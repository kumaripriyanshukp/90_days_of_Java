// Program to check whether the number is palindrome or not.
import java.util.*;
public class Palindrome {
    public static boolean isPalindrome(int n){
        int palindrome = n;
        int num = 0;
        while(n != 0){
            int rem = n%10;
            num = num*10+rem;
            n = n/10;
        }
        System.out.println(num);
        if(palindrome == num){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        if(isPalindrome(n)){
            System.out.println("Palindrome!");
        }
        else{
            System.out.println("Not Palindrome!");
        }
    }
}
