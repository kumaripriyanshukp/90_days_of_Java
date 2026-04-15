// To show hierarchical inheritance.
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Circles c = new Circles();
        c.draw();
        c.color();
        Triangle t = new Triangle();
        t.draw();
        t.side();
    }
}
class ShapeS{
    void draw(){
        System.out.println("Draw shapes!");
    }
}
class Circles extends ShapeS{
    void color(){
        System.out.println("Circles are white!");
    }
}
class Triangle extends ShapeS{
    void side(){
        System.out.println("Has three sides!");
    }
}
