 import java.util.Scanner;

class Prac12_Volume {
 
    double calculateVolume(double side) {
        return side * side * side;
    }

   
    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

     
    double calculateVolume(float radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Prac12_Volume obj = new Prac12_Volume();

         
        System.out.print("Enter side of Cube: ");
        double side = sc.nextDouble();
        System.out.println("Volume of Cube: " + obj.calculateVolume(side));

        
        System.out.print("\nEnter length of Rectangular Cube: ");
        double length = sc.nextDouble();
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        System.out.println("Volume of Rectangular Cube: " + obj.calculateVolume(length, width, height));

        
        System.out.print("\nEnter radius of Sphere: ");
        float radius = sc.nextFloat();
        System.out.println("Volume of Sphere: " + obj.calculateVolume(radius));

        sc.close();
    }
}   