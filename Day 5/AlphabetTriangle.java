// Program to print alphabet triangle pattern.
import java.util.*;
public class AlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines you want : ");
        int n = sc.nextInt();
        System.out.println("The pattern : ");
        for(int i = 1; i <= n; i++){
            char ch = 'A';
            for(int j = 1; j <= i; j++){
                System.out.print(ch +" ");
                ch++;
            }
            System.out.println();
        }
    }
}
