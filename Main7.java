package codes;

class Shape {
    public double getPerimeter() {
        return 0.0;
    }

    public double getArea() {
        return 0.0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;  // Perimeter of a circle: 2 * π * radius
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);  // Area of a circle: π * radius^2
    }
}

public class Main7 {
    public static void main(String[] args) {
        Shape myShape = new Shape();
        System.out.println("Shape perimeter: " + myShape.getPerimeter());
        System.out.println("Shape area: " + myShape.getArea());

        Circle myCircle = new Circle(5);  // Circle with radius 5
        System.out.println("Circle perimeter: " + myCircle.getPerimeter());
        System.out.println("Circle area: " + myCircle.getArea());
    }
}
