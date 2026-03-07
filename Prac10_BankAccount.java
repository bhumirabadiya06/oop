 import java.util.Scanner;

class Prac10_BankAccount {

    String account_holder_name;
    double balance;
    static double interest_rate = 5.0;

    // Constructor
    Prac10_BankAccount(String name, double bal) {
        account_holder_name = name;
        balance = bal;
    }

    // Method to calculate interest
    double calculateInterest() {
        return (balance * interest_rate) / 100;
    }

    // Method to display details
    void display() {
        System.out.println("Account Holder Name: " + account_holder_name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Earned: " + calculateInterest());
        System.out.println();
    }

    // Static method to update interest rate
    static void updateInterestRate(double rate) {
        interest_rate = rate;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input for first account
        System.out.print("Enter Account Holder Name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter Balance: ");
        double bal1 = sc.nextDouble();
        sc.nextLine();

        // User input for second account
        System.out.print("Enter Account Holder Name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter Balance: ");
        double bal2 = sc.nextDouble();

        // Creating objects
        Prac10_BankAccount acc1 = new Prac10_BankAccount(name1, bal1);
        Prac10_BankAccount acc2 = new Prac10_BankAccount(name2, bal2);

        // Update interest rate
        System.out.print("Enter New Interest Rate: ");
        double newRate = sc.nextDouble();
        Prac10_BankAccount.updateInterestRate(newRate);

        // Display details
        System.out.println("\nAccount Details:");
        acc1.display();
        acc2.display();

        sc.close();
    }
}
    
