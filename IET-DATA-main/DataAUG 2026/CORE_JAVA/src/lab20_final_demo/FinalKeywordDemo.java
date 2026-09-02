package lab20_final_demo;

/**
 * Lab 20: Demonstrating final modifier with Variables, Methods, and Classes.
 * Run command: java -cp bin lab20_final_demo.FinalKeywordDemo
 */
class CircleMath {
    public static final double PI = 3.14159;

    public void calculateArea(double radius) {
        double area = PI * radius * radius;
        System.out.printf("Area of Circle (Radius: %.2f) = %.2f\n", radius, area);
    }
}

class Parent {
    public final void displaySystemPolicy() {
        System.out.println("--> Parent final method: Security policy cannot be overridden.");
    }
}

class Child extends Parent {
    public void childSpecificAction() {
        System.out.println("--> Child class method executed.");
    }
}

final class ImmutableConfig {
    public void showConfig() {
        System.out.println("--> Final class ImmutableConfig: Cannot be inherited by any subclass.");
    }
}

public class FinalKeywordDemo {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("      DEMONSTRATING FINAL MODIFIER IN JAVA        ");
        System.out.println("==================================================");

        System.out.println("\n--- 1. Final Variable (Constant) ---");
        CircleMath circle = new CircleMath();
        System.out.println("CircleMath.PI constant value = " + CircleMath.PI);
        circle.calculateArea(5.0);

        System.out.println("\n--- 2. Final Method (Prevents Overriding) ---");
        Child childObj = new Child();
        childObj.displaySystemPolicy();
        childObj.childSpecificAction();

        System.out.println("\n--- 3. Final Class (Prevents Inheritance) ---");
        ImmutableConfig config = new ImmutableConfig();
        config.showConfig();

        System.out.println("==================================================");
    }
}
