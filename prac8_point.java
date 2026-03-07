class prac8_point {
    int x, y;

    // Default constructor
    prac8_point() {
        x = 5;
        y = 5;
    }

    // Parameterized constructor
    prac8_point(int a, int b) {
        x = a;
        y = b;
    }

    // Copy constructor
    prac8_point(prac8_point p) {
        x = p.x;
        y = p.y;
    }

    // Display method
    void display() {
        System.out.println("Point coordinates: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {

        // Default constructor
        prac8_point p1 = new prac8_point();
        System.out.println("Using Default Constructor:");
        p1.display();

        // Parameterized constructor
        prac8_point p2 = new prac8_point(10, 20);
        System.out.println("Using Parameterized Constructor:");
        p2.display();

        // Copy constructor
        prac8_point p3 = new prac8_point(p2);
        System.out.println("Using Copy Constructor:");
        p3.display();
    }
}