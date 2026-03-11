 import java.util.Scanner;

class prac11_college {

    String collegeName;

    // Constructor for outer class
    prac11_college(String name) {
        collegeName = name;
    }

    // Inner class
    class Admission {
        String studentName;
        String course;

        // Method to accept student details
        void accept() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();

            System.out.print("Enter Course: ");
            course = sc.nextLine();
        }

        // Method to display admission details
        void display() {
            System.out.println("\nAdmission Details");
            System.out.println("College Name: " + collegeName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input college name
        System.out.print("Enter College Name: ");
        String cname = sc.nextLine();

        // Create object of outer class
        prac11_college college = new prac11_college(cname);

        // Create object of inner class
        prac11_college.Admission ad = college.new Admission();

        // Accept and display student details
        ad.accept();
        ad.display();

        sc.close();
    }
}