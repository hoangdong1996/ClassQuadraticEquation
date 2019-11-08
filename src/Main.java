import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("QuadraticEquation");
        System.out.print("Enter a: ");
        double a = input.nextDouble();
        System.out.print("Enter b: ");
        double b = input.nextDouble();
        System.out.print("Enter c: ");
        double c = input.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (quadraticEquation.getDiscriminant() < 0) {
            System.out.println("The equation has no solution");
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("The equation has one solution: " + quadraticEquation.getRoot1());
        } else {
            System.out.println("the equation has tow solution: " +
                    "x1 = " + quadraticEquation.getRoot1() + "   " +
                    "x2 = " + quadraticEquation.getRoot2());
        }
    }
}
