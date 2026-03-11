import java.util.Scanner;

 
class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    Scanner sc = new Scanner(System.in);
 
    void openAccount() {
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        accountHolderName = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = sc.nextDouble();
    }

 
    void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        balance += amount;
    }

    
    void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();

        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

     
    void checkBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
 
class SavingAccount extends BankAccount {

    void calculateInterest() {
        double rate = 4; // 4% interest
        double interest = (balance * rate) / 100;
        System.out.println("Interest on Savings Account: " + interest);
    }
}

 
class FixedDepositAccount extends BankAccount {

    void maturityAmount() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter interest rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter time (years): ");
        int time = sc.nextInt();

        double maturity = balance + (balance * rate * time) / 100;
        System.out.println("Maturity Amount: " + maturity);
    }
}
 
public class Prac14_BankAccount {
    public static void main(String[] args) {

        SavingAccount sa = new SavingAccount();
        FixedDepositAccount fd = new FixedDepositAccount();

        System.out.println("----- Saving Account -----");
        sa.openAccount();
        sa.deposit();
        sa.withdraw();
        sa.checkBalance();
        sa.calculateInterest();

        System.out.println("\n----- Fixed Deposit Account -----");
        fd.openAccount();
        fd.checkBalance();
        fd.maturityAmount();
    }
}
