import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter coefficient of A:");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient of B:");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient of C:");
        double c = scanner.nextDouble();
        double determinant = b * b - 4 * a * c;
        if(determinant > 0) {
            double root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            double root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.println("The roots are:");
            System.out.println("Root 1:" + root1);
            System.out.println("Root 2:" + root2);
        }
        else if(determinant == 0) {
            double root = -b / (2 * a);
            System.out.println("There is one root:");
            System.out.println("Root:" + root);
        }
        else {
            System.out.println("There are no real roots:");
        }
    }
}
