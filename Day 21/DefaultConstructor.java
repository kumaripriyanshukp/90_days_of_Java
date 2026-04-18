// Program to implement default constructor.
public class DefaultConstructor {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.pass);
    }
}
class Student{
    String name;
    int age;
    boolean pass;
}
