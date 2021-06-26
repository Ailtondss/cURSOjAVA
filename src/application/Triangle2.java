package application;

import java.util.Locale;
import java.util.Scanner;

import entities.trinagle2;

public class Triangle2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rectangle width and height:");
		trinagle2 triang = new trinagle2();
		triang.width = sc.nextDouble();
		triang.height = sc.nextDouble();
		System.out.printf("AREA = %.2f%n ", triang.area());
		System.out.printf("PERIMETER = %.2f%n", triang.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", triang.diagonal());

		sc.close();
	}

}
