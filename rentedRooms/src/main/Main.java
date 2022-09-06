package main;

import java.util.Scanner;

import entities.Guest;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("How many rooms wil be rented? ");
		int roomsRented = 0;
		roomsRented = sc.nextInt();
		sc.nextLine();

		Guest[] guests = new Guest[10];
		String name;
		String email;
		int room = 0;

		for (int i = 1; i <= roomsRented; i++) {
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Room: ");
			room = sc.nextInt();
			sc.nextLine();

			do {
				if (guests[room] == null) {
					guests[room] = new Guest(name, email);
				} else {
					System.out.print("Room alrady rented, type another room: ");
					room = sc.nextInt();
					guests[room] = new Guest(name, email);
					sc.nextLine();
				}
			} while (!name.equals(guests[room].getName()));

		}
		for (int i = 0; i < guests.length; i++) {
			if (guests[i] != null) {
				System.out.println(i + ": " + guests[i].toString());
			}
		}
		sc.close();
	}

}
