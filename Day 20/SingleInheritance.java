// To show single inheritance.
public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Tommy";
        d.eat();
        d.sleep();
        d.bark();
    }
}
class AnimalS{
    String name;
    void eat(){
        System.out.println(name + " is eating.");
    }
    void sleep(){
        System.out.println(name + " is sleeping.");
    }
}
class Dog extends AnimalS{
    void bark(){
        System.out.println(name + " is barking. Woof!");
    }
}
