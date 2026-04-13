// Program to show encapsulation.
public class Encapsulation {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
    }
    static class Pen{
        String color;
        int tip;

        String getColor(){
            return this.color;
        }
        int getTip(){
            return this.tip;
        }
        void setColor(String color){
            this.color = color;
        }
        void setTip(int tip){
            this.tip = tip;
        }
    }
}
