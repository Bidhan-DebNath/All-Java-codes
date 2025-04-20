public class Circle {
    // ফাংশন যা পরিধি গণনা করে
    public static double calculateCircumference(double radius) {
        double pi = 3.14159; // পাই-এর মান
        return 2 * pi * radius; // সূত্র অনুযায়ী পরিধি গণনা
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // ইউজারের কাছ থেকে রেডিয়াস ইনপুট
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // ফাংশন কল এবং পরিধি প্রদর্শন
        double circumference = calculateCircumference(radius);
        System.out.println("Circle 's circumference is: " + circumference);

        scanner.close(); // রিসোর্স বন্ধ
    }
}
