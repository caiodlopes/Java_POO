package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.println("Name: ");
		String name = sc.nextLine();
		System.out.println("Price: ");
		Double price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		
		System.out.println(product.toString());
		
		System.out.println("Enter the number of products to be added from stock: ");
		product.addProducts(sc.nextInt());
		System.out.println(product.toString());
		
		System.out.println("Enter the number of products to be removed from stock: ");
		product.removeProducts(sc.nextInt());
		System.out.println(product.toString());
		
		sc.close();
	}

}
