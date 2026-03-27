//Prints You have a fever if your temperature is above 100 and otherwise prints You don't have a fever.
import java.util.*;
public class CheckTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature : ");
        float temp = sc.nextFloat();
        if(temp > 100){
            System.out.println("You have fever.");
        }
        else{
            System.out.println("No, You don't have fever.");
        }
    }
}
