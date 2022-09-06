package main;

import java.util.Scanner;

import entities.Triangle;

public class Main {
	public static void main(String[] args) {
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		Scanner sc = new Scanner(System.in);
		
		x.populaTriangulo(sc);
		x.calcArea();
		y.populaTriangulo(sc);
		y.calcArea();
		
		Triangle.showLarger(x, y);
		
		sc.close();
	}
	
	
}
