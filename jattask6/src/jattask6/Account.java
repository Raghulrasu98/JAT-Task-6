package jattask6;

public class Account {
	
	    private int accountNumber;
	    private String accountHolder;
	    private double balance;

	   
	    public Account() {
	        this.accountNumber = 0;
	        this.accountHolder = "Unknown";
	        this.balance = 0.0;
	    }

	
	    public Account(int accountNumber, String accountHolder) {
	        this.accountNumber = accountNumber;
	        this.accountHolder = accountHolder;
	        this.balance = 0.0;
	    }

	 
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	 
	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        } 
	        else {
	            System.out.println("Insufficient balance or invalid amount.");
	        }
	    }


	    public double getBalance() {
	        return balance;
	    }

	
	    public void printAccountDetails() {
	        System.out.println("Account No: " + accountNumber);
	        System.out.println("Holder: " + accountHolder);
	        System.out.println("Balance: " + balance);
	    }
	}



