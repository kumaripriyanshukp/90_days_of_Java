// Program to print binomial coefficient.
import java.util.*;
public class BinomialCoefficient {
    public static int  factorial(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }
    public static void binCoeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nminr = factorial(n-r);
        int c =  fact_n / (fact_r *fact_nminr);
        System.out.println("The binomial coefficient : " + c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n and r : ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        binCoeff(n,r);
    }
}
