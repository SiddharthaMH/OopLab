abstract class Shape {
    // Abstract method to calculate the area
    public abstract double calculateArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class AreaCalculationDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        Circle circle = new Circle(2.0);

        // Calculate and display the areas
        System.out.println("Area of the Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of the Circle: " + circle.calculateArea());
    }
}
