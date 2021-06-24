package application;

import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);

			double xA, xB, xC, yA, yB, yC;
			xA = sc.nextDouble();
			xB = sc.nextDouble();
			xC = sc.nextDouble();
			System.out.println("Enter the measures of triangle X");
			yA = sc.nextDouble();
			yB = sc.nextDouble();
			yC = sc.nextDouble();
			System.out.println("Enter the measures of triangle Y");
			double p = (xA + xB + xC) / 2.0;
			double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
			p = (xA + xB + xC) / 2.0;
			double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
			System.out.printf("Triagle X area: %.4f%n", areaX);
			System.out.printf("Triagle y area: %.4f%n", areaY);

			if (areaX > areaX) {
				System.out.println("Larger area: X");
			} else {
				System.out.println("Larger area: Y");
			}

			sc.close();

		}
	}


