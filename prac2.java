 import java.util.Scanner;

public class prac2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input coefficients
        System.out.print("Enter a, b, c, d, e, f: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();

        // Cramer's rule calculations
        double D = a * d - b * c;
        double Dx = e * d - b * f;
        double Dy = a * f - e * c;

        // Check if denominator is zero
        if (D == 0) {
            System.out.println("The equation has no unique solution (D = 0).");
        } else {
            double x = Dx / D;
            double y = Dy / D;

            System.out.println("Value of x = " + x);
            System.out.println("Value of y = " + y);
        }

        sc.close();
    }
}