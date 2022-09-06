package application;

import java.util.Scanner;

import entities.Account;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		Double balance;
		int accountNumber;
		Account account;
		
		System.out.println("Welcome do bank system for opening accounts.");
		System.out.println("Type yout name: ");
		name = sc.next();
		System.out.println("Type youe account number: ");
		accountNumber = sc.nextInt();
		
		System.out.println("Do you want to deposit now(Y/N)?");
		Character option = sc.next().charAt(0);
		if (option == 'y') {
			
			System.out.println("Type the value to deposit: ");
			balance = sc.nextDouble();
			
			account = new Account(name, balance, accountNumber);
		} else  {
			
			account = new Account(name, accountNumber);
		}
		
		System.out.println(account.toString());
		System.out.println();
		
		System.out.println("Type the deposit value:");
		balance = sc.nextDouble();
		account.deposit(balance);
		System.out.println();
		System.out.println(account.toString());
		
		System.out.println("Type the withdraw value:");
		balance = sc.nextDouble();
		account.withdraw(balance);
		System.out.println();
		System.out.println(account.toString());
		
		sc.close();
	}

}
