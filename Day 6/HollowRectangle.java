// Program to print hollow rectangle pattern.
import java.util.*;
public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth : ");
        int b = sc.nextInt();
        int l = sc.nextInt();
        System.out.println("The hollow rectangle : ");
        for(int i = 1; i <= b; i++){
            for(int j = 1; j <= l; j++){
                if(i == 1 || i == b || j == 1 || j == l){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
