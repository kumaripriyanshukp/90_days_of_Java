// Program to implement parametrized constructor.
public class ParameterizedConstructor {
    public static void main(String[] args) {
        Students s1 = new Students("Alice", 10, "A");
        Students s2 = new Students("Bob",12,"B");
        s1.display();
        System.out.println("--------------------------------------");
        s2.display();

    }
}
class Students{
    String name;
    int age;
    String grade;
    Students(String n, int a, String g){
        name = n;
        age = a;
        grade = g;
    }
    void display(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Grade : " + grade);
    }
}
