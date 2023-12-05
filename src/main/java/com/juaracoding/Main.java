package com.juaracoding;

public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.setAccount(101999, "Salma", 7.0);
        System.out.println(account.getAccountNumber());
        System.out.println(account.getName());
        System.out.println(account.getAmount());

        BankAccount depo = new BankAccount();
        depo.deposit(2.0);

        BankAccount wd = new BankAccount();
        wd.withdraw(0.0);

        BankAccount balance = new BankAccount();
        balance.checkBalance();

        BankAccount print = new BankAccount();
        print.display();
    }
}