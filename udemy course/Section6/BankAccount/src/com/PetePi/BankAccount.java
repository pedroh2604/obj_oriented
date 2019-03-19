package com.PetePi;

public class BankAccount {
    private int accountNumber;
    private float balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public float getBalance () {
        return this.balance;
    }

    public String getCustomerName () {
        return this.customerName;
    }

    public String getEmail () {
        return this.email;
    }

    public String getPhoneNumber () {
        return this.phoneNumber;
    }

    public void setAccountNumber (int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance (float balance) {
        this.balance = balance;
    }

    public void setCustomerName (String customerName) {
        this.customerName = customerName;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public void setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds (float deposit) {
        this.balance += deposit;
        System.out.println("Deposit of " + deposit + " processed. Remaining balance " + this.balance);
    }

    public void withdrawFunds(float withdraw) {
        if (withdraw > this.balance) {
            System.out.println("Not enough funds");
        } else {
            this.balance -= withdraw;
            System.out.println("Withdraw of " + withdraw + " processed. Remaining balance " + this.balance);
        }
    }
}
