// Program to check whether the string is palindrome or not using string builder.
public class PalindromeUsingStringBuilder {
    public static boolean isPalindrome(StringBuilder sb){
        for(int i = 0; i < sb.length()/2; i++){
            if(sb.charAt(i) != sb.charAt(sb.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("racecar");
        System.out.println("Is the string palindrome : " + isPalindrome(sb));
    }
}
