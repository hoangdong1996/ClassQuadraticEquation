import java.util.Scanner;

public class QuadraticEquation {
    double a, b, c;
    double delta;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return this.delta = Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return (-this.b + Math.sqrt(this.delta)) / (2 * a);
    }

    public double getRoot2() {
        return (-this.b - Math.sqrt(this.delta)) / (2 * a);
    }

    public void inputValue() {
        Scanner input = new Scanner(System.in);

        System.out.println("QuadraticEquation");
        System.out.print("Enter a: ");
        this.a = input.nextDouble();
        System.out.print("Enter b: ");
        this.b = input.nextDouble();
        System.out.print("Enter c: ");
        this.c = input.nextDouble();
    }

    public void outputValue() {
        if (this.getDiscriminant() < 0) {
            System.out.println("The equation has no solution");
        } else if (this.getDiscriminant() == 0) {
            System.out.println("The equation has one solution: " + this.getRoot1());
        } else {
            System.out.println("the equation has tow solution: " +
                    "x1 = " + this.getRoot1() + "   " +
                    "x2 = " + this.getRoot2());
        }
    }
}
