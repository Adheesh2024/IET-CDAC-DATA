package lab22_printable_interface;

/**
 * Lab 22: Printable interface implementation across Shape and Employee hierarchies.
 * Run command: java -cp bin lab22_printable_interface.PrintableInterfaceDemo
 */
interface Printable {
    void print();
}

abstract class Shape {
    protected String shapeName;

    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }

    public abstract double calculateArea();
}

class Circle extends Shape implements Printable {
    private double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void print() {
        System.out.printf("[PRINTABLE] Circle -> Radius: %.2f | Calculated Area: %.2f\n", radius, calculateArea());
    }
}

class Square extends Shape implements Printable {
    private double side;

    public Square(double side) {
        super("Square");
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void print() {
        System.out.printf("[PRINTABLE] Square -> Side: %.2f   | Calculated Area: %.2f\n", side, calculateArea());
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }
}

class SalariedEmployee extends Employee implements Printable {
    private double salary;

    public SalariedEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public void print() {
        System.out.printf("[PRINTABLE] SalariedEmployee -> Name: %-12s | Monthly Salary: $%.2f\n", name, salary);
    }
}

public class PrintableInterfaceDemo {

    public static void showData(Printable p) {
        p.print();
    }

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("     PRINTABLE INTERFACE POLYMORPHISM DEMO        ");
        System.out.println("==================================================");

        Circle circle = new Circle(5.0);
        Square square = new Square(4.0);
        SalariedEmployee employee = new SalariedEmployee("David Miller", 7500.0);

        System.out.println("Invoking showData(Printable p) polymorphically:\n");
        
        showData(circle);
        showData(square);
        showData(employee);

        System.out.println("==================================================");
    }
}
