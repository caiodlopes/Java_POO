package entities;

import java.util.Scanner;

public class Triangle {
	private String name;
	private double a;
	private double b;
	private double c;
	private double area;
	
	public void calcArea() { 
		double p = (a + b + c)/2.0;
		this.area = Math.sqrt(p * (p-a) * (p-b) * (p-c));
		System.out.println(this.area);
	}
	
	public void populaTriangulo(Scanner sc) {
		System.out.println("Digite o nome do triângulo:");
		this.name = sc.next();
		System.out.println("Digite as medidas do triangulo: " + this.name);
		this.a = sc.nextDouble();
		this.b = sc.nextDouble();
		this.c = sc.nextDouble();
	}
	
	public static void showLarger(Triangle t1, Triangle t2) {
		if (t1.area > t2.area) {
			System.out.println("Larger triangle:" + t1.name);
		} else
			System.out.println("Larger triangle:" +  t2.name);
	}
}
	