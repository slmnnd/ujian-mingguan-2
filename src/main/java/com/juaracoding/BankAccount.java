package com.juaracoding;

public class BankAccount {

    private int acc_no;
    private String name;
    private double amount;

    public void setAccount(int a, String n, double amt) {
        acc_no = a;
        name = n;
        amount = amt;
    }

    public int getAccountNumber(){
        return acc_no;
    }

    public String getName(){
        return name;
    }

    public double getAmount(){
        return amount;
    }

    public double deposit(double amt) {
        this.amount = amount + amt;
        System.out.println(amt + " is deposited");
        return this.amount;
    }


    public double withdraw(double amt) {

        if (this.amount < amt) {
            System.out.println("Insufficient Balance");
        } else {
            this.amount = amount - amt;
            System.out.println(amt + " withdrawn");
        }

        return this.amount;
    }

    public double checkBalance() {
        System.out.println("Balance is: " + this.amount);
        return this.amount;
    }

    public void display() {
        System.out.println(acc_no + " " + name + " " + amount);
    }
}
