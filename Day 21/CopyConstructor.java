// Program to show copy constructors.
public class CopyConstructor {
    public static void main(String[] args) {
        Employee e1 = new Employee(101,"Alice", 70000.0);
        Employee e2 = new Employee(e1);
        System.out.println("-----------Original Employee---------------");
        e1.display();
        System.out.println("-------------Copy Employee----------------");
        e2.display();
        e2.name = "Bob";
        System.out.println("-----------Original Employee---------------");
        e1.display();
        System.out.println("-------------Copy Employee----------------");
        e2.display();
    }
}
class Employee{
    int id;
    String name;
    double salary;
    Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    Employee(Employee e){
        this.id = e.id;
        this.name = e.name;
        this.salary = e.salary;
    }
    void display(){
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
    }
}
