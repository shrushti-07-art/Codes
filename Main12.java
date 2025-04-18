package codes;

interface Drawable {
    void draw();
}

abstract class Shape2 {
    abstract void area();
    abstract void perimeter();
}

class Rectangle extends Shape2 implements Drawable {
    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void area() {
        System.out.println("Area of Rectangle: " + (length * width));
    }

    @Override
    void perimeter() {
        System.out.println("Perimeter of Rectangle: " + (2 * (length + width)));
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

class Circle2 extends Shape2 implements Drawable {
    double radius;

    public Circle2(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }

    @Override
    void perimeter() {
        System.out.println("Perimeter of Circle: " + (2 * Math.PI * radius));
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}

public class Main12 {
    public static void main(String[] args) {
        Shape2 rect = new Rectangle(4, 5);
        rect.area();
        rect.perimeter();
        ((Drawable) rect).draw();  // Casting to Drawable to access draw method

        Shape2 circle = new Circle2(3);
        circle.area();
        circle.perimeter();
        ((Drawable) circle).draw();
    }
}
