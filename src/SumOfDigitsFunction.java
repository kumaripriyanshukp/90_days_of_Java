// Program to print the sum of digits functions.
public class SumOfDigitsFunction {
    public static int sumOfDigits(int num){
        int sum = 0;
        while(num > 0){
            int r = num%10;
            sum = sum+r;
            num = num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int num = 12345;
        System.out.println("The sum of digits : " + sumOfDigits(num));
    }
}

