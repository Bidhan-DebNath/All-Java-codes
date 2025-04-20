import bank;

class Shape {
    String color;
    String name;

    // Method to print the color
    public void printColor() {
        System.out.println("The color is: " + color);
    }
}

class Triangle extends Shape {
    int base, height;

    // Method to print the area
    public void printArea() {
        System.out.println("The Area is: " + (0.5 * base * height));
    }
}

class EquilateralTriangle extends Triangle {
    // Method to print the size
    public void printSize(int length, int height) {
        System.out.println("The size of the Equilateral Triangle is: " + (0.5 * height * length));
    }
}

class Circle extends Shape {
    public void printName() {
        System.out.println("The name is: " + name);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Create a Triangle object
        Triangle triangle = new Triangle();
        triangle.base = 10;
        triangle.height = 5;
        triangle.color = "Green";

        // Print triangle details
        triangle.printArea();
        triangle.printColor();

        // Create an EquilateralTriangle object
        EquilateralTriangle equilateralTriangle = new EquilateralTriangle();
        equilateralTriangle.printSize(10, 5);

        // Create a Circle object
        Circle circle = new Circle();
        circle.name = "Circle Shape";
        circle.printName();

        // Create an Account object from the bank package
        bank.Account account = new bank.Account();
        account.setName("Customer Account");
        System.out.println("Account name is: " + account.getName());
    }
}
