// Program to print reverse alphabet pattern.
import java.util.*;
public class ReverseAlphabetPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines you want : ");
        int n = sc.nextInt();
        System.out.println("The pattern : ");
        for(int i = n; i >= 1; i--){
            char ch = 'A';
            for(int j = 1; j <= i; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
