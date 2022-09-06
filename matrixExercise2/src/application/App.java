package application;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		
		System.out.println(mat.length);
		System.out.println(mat[0].length);
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();

			}
		}
		
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				int matrixNumber = mat[i][j];
				if (matrixNumber == num) {
					System.out.println("Position:" + i + ", " + j);
					findArroundNumbers(mat, i, j);
				}

			}
		}
		
		sc.close();
	}
	
	public static void findArroundNumbers(int[][] mat, int m,int n) {
		//have left number
		if (n > 0) {
			System.out.println("Left: " + mat[m][n-1]);
		}
		//have right number
		if (n < mat[m].length - 1) {
			System.out.println("Right: " + mat[m][n+1]);
		}
		//have top number
		if (m > 0) {
			System.out.println("Up: " + mat[m-1][n]);
		}
		//have bottom number
		if (m < mat.length - 1) {
			System.out.println("Down: " + mat[m+1][n]);
		}
		System.out.println();
	}

}
