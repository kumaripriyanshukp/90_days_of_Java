// Program to check whether the number is palindrome or not using functions.
public class PalindromeFunction {
    public static boolean isPalindrome(int num){
        int original = num;
        int pal = 0;
        while(num > 0){
            int r = num%10;
            pal = pal*10+r;
            num = num/10;
        }
        if(pal == original){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int num = 123;
        if(isPalindrome(num)){
            System.out.println("Palindrome!");
        }
        else{
            System.out.println("Not palindrome!");
        }
    }
}
