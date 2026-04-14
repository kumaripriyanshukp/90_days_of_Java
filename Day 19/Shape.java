// Program to show inheritance.
public class Shape {
    public static void main(String[] args) {
        Shapes s1 = new Circle(5);
        Shapes s2 = new Rectangle(4, 6);

        s1.area();
        s2.area();
    }
}
class Shapes {
    void area() {
        System.out.println("Calculating area...");
    }
}

class Circle extends Shapes {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

class Rectangle extends Shapes {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}
