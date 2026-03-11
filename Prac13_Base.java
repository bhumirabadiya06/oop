import java.util.Scanner;
 
class Shape {
    double d1, d2;

    void getData(double a, double b) {
        d1 = a;
        d2 = b;
    }
}
 
class Triangle extends Shape {
    double area() {
        return 0.5 * d1 * d2;
    }
}

 
class Rectangle extends Shape {
    double area() {
        return d1 * d2;
    }
}

 
public class Prac13_Base {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Triangle t = new Triangle();
        Rectangle r = new Rectangle();

         
        System.out.print("Enter base of Triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter height of Triangle: ");
        double height = sc.nextDouble();
        t.getData(base, height);

         
        System.out.print("\nEnter length of Rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter width of Rectangle: ");
        double width = sc.nextDouble();
        r.getData(length, width);

 
        System.out.println("\nArea of Triangle: " + t.area());
        System.out.println("Area of Rectangle: " + r.area());

        sc.close();
    }
}