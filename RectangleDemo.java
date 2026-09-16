// Concept: Constructor Overloading, Default Constructor, Parameterized Constructor and User Input

import java.util.Scanner;

class Rectangle {

    double length;
    double breadth;

    // Default constructor
    Rectangle() {
        length = 1;
        breadth = 1;
    }

    // Parameterized constructor
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    double calculateArea() {
        return length * breadth;
    }
}

public class RectangleDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Object using default constructor
        Rectangle rectangle1 = new Rectangle();

        System.out.println(
                "Rectangle 1 Area = " + rectangle1.calculateArea()
        );

        // Get values from user
        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth: ");
        double breadth = sc.nextDouble();

        // Object using parameterized constructor
        Rectangle rectangle2 =
                new Rectangle(length, breadth);

        System.out.println(
                "Rectangle 2 Area = " + rectangle2.calculateArea()
        );

        sc.close();
    }
}