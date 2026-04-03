// Program to print the reverse number using functions.
package Day_10;

public class ReverseNumberFunctions {
    public static int reverseNumber(int num){
        int rev = 0;
        while(num > 0){
            int r = num%10;
            rev = rev*10+r;
            num = num/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        int num = 12345;
        System.out.println("the reverse number : " + reverseNumber(num));
    }
}

