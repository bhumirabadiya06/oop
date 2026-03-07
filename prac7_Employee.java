 import java.util.Scanner;

public class prac7_Employee {

    // Private instance variables
    private String employeeName;
    private double employeeSalary;

    // Method to read employee data
    public void readEmployeeData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        employeeName = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        employeeSalary = sc.nextDouble();
    }

    // Method to display employee data
    public void displayEmployeeData() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
    }

    // Main method
    public static void main(String[] args) {
        prac7_Employee emp = new prac7_Employee(); // object creation
        emp.readEmployeeData();                    // method call
        emp.displayEmployeeData();                 // method call
    }

}