package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int count = scan.nextInt();
		String[] fnames = new String[count];
		String[] lnames = new String[count];
		double[] tprice = new double[count]; // an array of doubles (prices)

		for (int i = 0; i < count; i++) { // for loop for the customers
			fnames[i] = scan.next();
			lnames[i] = scan.next();
			int item = scan.nextInt();

			for (int j = 0; j < item; j++) { // for loop for the list
				int quantity = scan.nextInt();
				String itemtype = scan.next();
				double price = scan.nextDouble();
				tprice[i] += quantity * price; // equation to display total price

			}

		}
		// end of for loop.

		for (int i = 0; i < count; i++) {
			System.out.println(fnames[i].charAt(0) + ". " + lnames[i] + ": " + String.format("%.2f", tprice[i])); // "%.2f"
																													// makes
																													// the
																													// number
																													// ot
																													// the
																													// hundreths
																													// place

		}

	}

}
