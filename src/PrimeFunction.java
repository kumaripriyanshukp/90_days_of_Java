// Program to print whether the number is prime or not using functions.
public class PrimeFunction {
    public static boolean isPrime(int num){
        for(int i = 2; i < Math.sqrt(num); i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int num = 15;
        System.out.println("The number is prime: " + isPrime(num));
    }
}
