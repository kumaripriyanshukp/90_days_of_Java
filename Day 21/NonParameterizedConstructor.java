// Program to implement non parameterized constructor.
public class NonParameterizedConstructor {
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
    }
}
class Car{
    String brand;
    String color;
    int speed;
    Car(){
        brand = "Toyota";
        color = "White";
        speed = 100;
    }
    void display(){
        System.out.println("Brand : " +brand);
        System.out.println("Color : " + color);
        System.out.println("Speed : " + speed);
    }
}
