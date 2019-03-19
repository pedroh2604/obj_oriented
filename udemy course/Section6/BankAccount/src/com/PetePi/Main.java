package com.PetePi;

public class Main {

    public static void main(String[] args) {
	    BankAccount account = new BankAccount();
        account.setAccountNumber(789);
        account.setBalance(500);
        account.setCustomerName("Pedro Silva");
        account.setEmail("pedro@peter.com");
        account.setPhoneNumber("555-5555");

        System.out.println("The account number is " + account.getAccountNumber());
        System.out.println("The balance is " + account.getBalance());
        System.out.println("Hi, " + account.getCustomerName());
        System.out.println("Your email is " + account.getEmail());
        System.out.println("Your phone number is: " + account.getPhoneNumber());

        account.depositFunds(200);
        account.withdrawFunds(100);

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getCustomerName());

        VipCustomer person2 = new VipCustomer("Dels", 500);
        System.out.println(person2.getCustomerName());

        VipCustomer person3 = new VipCustomer("Peter", 400, "email@jdjd.com");
        System.out.println(person3.getCustomerName());
    }
}
