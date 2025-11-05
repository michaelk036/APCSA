/*
Question 2: The Bank Account Challenge 

Create a class called BankAccount.
- Each account has an accountHolder (String) and balance (double).
- The default constructor should set accountHolder to "Anonymous" and balance to 0.0.
- The parameterized constructor should take the accountholder's name and starting balance.
- Write a method deposit(double amount) that increases the balance.
- Wnite a method withdraw(double amount) that decreases the balance only if there's enough money (use an if check).
- Write a method printAccount) to print the accountHolder and balance.

In the main method:
1. Create one account using the default constructor.
2. Create another account using the parameterized constructor.
3. Perform some deposits and withdrawals, then print the results.
*/
import java.util.Scanner;

class BankAcc {
    public static void main(String[] args) {
        BankAccount b = new BankAccount(); //default constructor
        b.deposit();
        b.withdraw();
        b.printAccount();

        BankAccount b1 = new BankAccount("Michael",200.00); //parameterized constructor
        b1.deposit();
        b1.withdraw();
        b1.printAccount();
    }
}

class BankAccount {
    Scanner sc = new Scanner(System.in);

    String accountHolder;
    double balance;

    BankAccount() {
        accountHolder = "Anonymous";
        balance = 0.0;
    }

    BankAccount(String name, double money) {
        accountHolder = name;
        balance = money;
    }

    void deposit() { //parameter fix
        System.out.println("Hello " +accountHolder+ ", how much would you like to deposit?");
        double deposit = sc.nextDouble();

        balance += deposit;
        System.out.println("Your balance is now $" +balance);
    }

    void withdraw() {
        if (balance >= 100.00) {
            System.out.println("Hello " +accountHolder+ ", how much would you like to withdraw?");
            double withdraw = sc.nextDouble();

            balance -= withdraw;
            System.out.println("Your balance is now $" +balance);
        }

        else {
            System.out.println("Insufficient funds, you cannot withdraw money.");
        }
    }

    void printAccount() {
        System.out.println(accountHolder+ "'s account balance has $" +balance);
    }
}