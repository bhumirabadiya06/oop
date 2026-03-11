import java.util.Scanner;

 
class Employee {
    String name;
    String department;

    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Department: " + department);
    }
}

 
class Manager extends Employee {
    int teamSize;
    String projectName;

    
    void displayDetails() {
        System.out.println("Manager Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
        System.out.println("Project Name: " + projectName);
    }
}

 
public class Prac15_Employee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        Employee e = new Employee();
        System.out.println("Enter Employee Details");
        System.out.print("Name: ");
        e.name = sc.nextLine();
        System.out.print("Department: ");
        e.department = sc.nextLine();

         
        Manager m = new Manager();
        System.out.println("\nEnter Manager Details");
        System.out.print("Name: ");
        m.name = sc.nextLine();
        System.out.print("Department: ");
        m.department = sc.nextLine();
        System.out.print("Team Size: ");
        m.teamSize = sc.nextInt();
        sc.nextLine();
        System.out.print("Project Name: ");
        m.projectName = sc.nextLine();

        
        System.out.println("\nEmployee Details:");
        e.displayDetails();

        System.out.println("\nManager Details:");
        m.displayDetails();

        sc.close();
    }
}
