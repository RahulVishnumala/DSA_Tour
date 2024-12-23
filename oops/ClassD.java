package oops;

abstract class Shape{
    abstract void calculateArea();
    abstract void calculatePerimeter();

}

class Circle extends Shape{
    private int r;
    Circle(int r){
        this.r = r;
    }
    void calculateArea(){
        System.out.println("Area of circle = "+3.14*r*r);
    }
    void calculatePerimeter(){
        System.out.println("Perimeter of circle = "+2*3.14*r);
    }
}
class Rectangle extends Shape{
    private int l;
    private int b;
    Rectangle(int l,int b){
        this.l = l;
        this.b = b;
    }
    void calculateArea(){
        System.out.println("Area of rectangle = "+l*b);
    }
    void calculatePerimeter(){
        System.out.println("Perimeter of rectangle = "+2*(l+b));
    }
}

public class ClassD {
    public static void main(String[] args) {
        Circle c = new Circle(12);
        c.calculateArea();
        c.calculatePerimeter();

        Rectangle r = new Rectangle(2,3);
        r.calculateArea();
        r.calculatePerimeter();
    }
}
