class prac9_Rectangle {
    double width;
    double height;

    
    prac9_Rectangle(double w, double h) {
        width = w;
        height = h;
    }

 
    double getArea() {
        return width * height;
    }

 
    double getPerimeter() {
        return 2 * (width + height);
    }
 
    void display() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }

    public static void main(String[] args) {

        
        prac9_Rectangle r1 = new prac9_Rectangle(4, 40);
        prac9_Rectangle r2 = new prac9_Rectangle(3.5, 35.9);

        System.out.println("Rectangle 1 Details:");
        r1.display();

        System.out.println("\nRectangle 2 Details:");
        r2.display();

      
        if (r1.getArea() > r2.getArea()) {
            System.out.println("\nRectangle 1 has a larger area.");
        } else if (r1.getArea() < r2.getArea()) {
            System.out.println("\nRectangle 2 has a larger area.");
        } else {
            System.out.println("\nBoth rectangles have equal area.");
        }
    }
} 
    
