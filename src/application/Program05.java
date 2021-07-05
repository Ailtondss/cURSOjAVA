package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program05 {

	public static void main(String[] args) {
		Account account;
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter account number:");
		int number = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter account holder:");

		String holder = sc.nextLine();
		System.out.print("It there an initial deposit (y/n)?");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} else {
			account = new Account(number, holder);
		}
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);

		System.out.println();
		System.out.println("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Upate account data: ");
		System.out.print(account);
		
		System.out.println();
		System.out.print("Enter a withdeaw value: ");
		double dwithdeawValue = sc.nextDouble();
		account.withdeaw(dwithdeawValue);
		System.out.println("Upate account data: ");
		System.out.print(account);


		sc.close();
	}

}
