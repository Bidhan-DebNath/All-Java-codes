class Student {
    String name;
    int age;

    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to print information
    public void printInfo() {
        System.out.println("The constructor name is: " + name);
        System.out.println("The constructor age is: " + age);
    }

    // Overloaded methods
    public void information(String name) {
        System.out.println("The name is: " + name);
    }

    public void information(String name, int age) {
        System.out.println("The name is: " + name);
        System.out.println("Age is: " + age);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        // Creating a Student object
        Student studentOne = new Student("Urmi Dutta", 23);

        // Invoking overloaded methods
        studentOne.information("Paku Harami");
        studentOne.printInfo();
        studentOne.information("Bidhan", 25);
    }
}
