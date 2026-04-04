// Program to convert minutes int years and days
import java.util.*;
public class MinutesToYearsDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        int min = sc.nextInt();
        int totalDays = min / (60*24);
        int years = totalDays / 365;
        int days = totalDays % 365;

        System.out.println(years + " years " + days +" days" );
    }
}
