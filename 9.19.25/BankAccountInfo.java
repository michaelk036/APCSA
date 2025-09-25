/*
Question 2: Create a class BankAccount

Data Members:

    account_number
    account_holder_name
    balance

Methods:

    getAccount() - to input account details and initial deposit
    withdraw() - to withdraw an amount (check if sufficient balance)
    deposit() - to deposit an amount
    showBalance() - display current balance
 */

import java.util.Scanner;

class BankAccount {
    Scanner sc = new Scanner(System.in);

    int account_number;
    String account_holder_name;
    double balance;

    void getAccount() {
        System.out.println("Enter your Account Holder's name");
        account_holder_name = sc.nextLine();
        System.out.println("Enter your account number");
        account_number = sc.nextInt();
        System.out.println("Enter your initial deposit amount");
        balance = sc.nextDouble();
    }

    void withdraw() {
        System.out.println("How much would you like to withdraw from your account");
        double withdraw = sc.nextDouble();

        balance -= withdraw;
        System.out.println("You successfully withdrew $" +withdraw);
    }

    void deposit() {
        System.out.println("How much would you like to deposit to your account");
        double deposit = sc.nextDouble();

        balance += deposit;
        System.out.println("You successfully deposited $" +deposit);
    }

    void showBalance() {
        System.out.println("Your current account balance in Account number " +account_number+ " is $" +balance);
    }
}

class BankAccountInfo {
    public static void main(String[] args) {
        BankAccount i = new BankAccount();
        i.getAccount();
        i.withdraw();
        i.deposit();
        i.showBalance();
    }
}