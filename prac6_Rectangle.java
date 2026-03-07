 class prac6_Rectangle {

    double width = 1;
    double height = 1;

  
    prac6_Rectangle() {
    }

   
    prac6_Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    
    double getArea() {
        return width * height;
    }

    
    double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        prac6_Rectangle r1 = new prac6_Rectangle();
        prac6_Rectangle r2 = new prac6_Rectangle(5, 4);

        System.out.println("Area of Rectangle 1: " + r1.getArea());
        System.out.println("Perimeter of Rectangle 1: " + r1.getPerimeter());

        System.out.println("Area of Rectangle 2: " + r2.getArea());
        System.out.println("Perimeter of Rectangle 2: " + r2.getPerimeter());
    }
}