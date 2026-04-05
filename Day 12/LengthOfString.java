// Program to print the length of a string (without using .length()).
public class LengthOfString {
    public static void main(String[] args) {
        String str = "Priyanshu";
        int len = 0;
        for(int i = 0; i < str.length(); i++){
            len++;
        }
        System.out.println("The length of string is : "+ len);
    }
}
