// Program to show method overloading in polymorphism.
public class MethodOverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum(2.2f,4.5f));
        System.out.println(calc.sum(2,4,7));
    }
}
class Calculator{
    int sum(int a, int b){
        return a + b;
    }
    float sum(float a, float b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }
}
