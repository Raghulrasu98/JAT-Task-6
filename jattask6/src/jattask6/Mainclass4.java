package jattask6;

public class Mainclass4 {
	
	    public static void main(String[] args) {
	        Account acc = new Account(65476, "raghul");

	        acc.deposit(14000);
	        acc.withdraw(3000);
	        System.out.println("Current Balance: " + acc.getBalance());

	        acc.printAccountDetails();
	    }
	}


