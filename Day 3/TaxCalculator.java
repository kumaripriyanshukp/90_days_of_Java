// Program to calculate the tax.
import java.util.*;
public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income : ");
        float income = sc.nextFloat();
        float tax = 0;
        if(income < 500000){
            System.out.println("No tax!");
        }
        else if(income > 500000 || income < 1000000){
            tax = income * 0.2f;
        }
        else{
            tax = income * 0.3f;
        }
        System.out.println("The tax : " + tax);
    }

}
