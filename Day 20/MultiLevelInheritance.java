// To show multilevel inheritance.
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}
class Mammal{
    void eat(){
        System.out.println("Mammal eats!");
    }
}
class Dogs extends Mammal{
    void bark(){
        System.out.println("Dog bark!");
    }
}
class Puppy extends Dogs{
    void weep(){
        System.out.println("Puppy weeps!");
    }
}
