// Concept: Abstract Classes, Abstract Methods, Concrete Methods,
// Method Overriding, Polymorphic Arrays and User Input

import java.util.Scanner;

abstract class Shape {

    // Abstract method
    abstract double getArea();

    // Concrete method
    void describe() {
        System.out.println("This is a geometric shape.");
    }
}

class Circle extends Shape {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Implementing abstract method
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    void describe() {
        System.out.println("This is a circle.");
    }
}

class Rectangle extends Shape {

    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Implementing abstract method
    @Override
    double getArea() {
        return length * breadth;
    }

    @Override
    void describe() {
        System.out.println("This is a rectangle.");
    }
}

public class ShapeAreaToolkit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking Circle input
        System.out.print("Enter circle radius: ");
        double radius = sc.nextDouble();

        // Taking Rectangle input
        System.out.print("Enter rectangle length: ");
        double length = sc.nextDouble();

        System.out.print("Enter rectangle breadth: ");
        double breadth = sc.nextDouble();

        // Creating objects
        Circle circle = new Circle(radius);
        Rectangle rectangle = new Rectangle(length, breadth);

        // Polymorphic array
        Shape[] shapes = {circle, rectangle};

        System.out.println("\n===== SHAPE DETAILS =====");

        // Loop through Shape array
        for (Shape shape : shapes) {

            shape.describe();

            System.out.println(
                    "Area = " + shape.getArea()
            );

            System.out.println();
        }

        /*
        ERROR:

        Shape shape = new Shape();

        Shape is an abstract class, so we cannot
        create an object of Shape directly.

        We must create objects of its concrete
        subclasses such as Circle or Rectangle.
        */

        sc.close();
    }
}