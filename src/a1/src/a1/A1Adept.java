package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int count = scan.nextInt(); // initial count
		String[] groceryitem = new String[count];
		double[] tprice = new double[count]; // an array of doubles (prices)
		for (int i = 0; i < count; i++) { // for loop for the customers
			groceryitem[i] = scan.next(); // this will scan through the list of grocery items
			tprice[i] = scan.nextDouble(); // will scan through the price of each item
		}
		int object = scan.nextInt();
		String[] fnames = new String[object];
		String[] lnames = new String[object];
		Double[] totalexp = new Double[object];
		for (int zero = 0; zero < object; zero++) {
			totalexp[zero] = 0.0;
		}
		for (int j = 0; j < object; j++) { // for loop for the customers
			fnames[j] = scan.next(); // scans for the first names
			lnames[j] = scan.next(); // scans for the last names 
			int number = scan.nextInt();

			for (int n = 0; n < number; n++) {
				int groceryquantity = scan.nextInt();
				String groceries = scan.next();

				int index = 0;
				for (int h = 0; h < count; h++) {
					if (groceries.equals(groceryitem[h])) {
						index = h;
					}
				}
				totalexp[j] += tprice[index] * groceryquantity;
			}
		}
		int biggest = 0; // biggest int 
		int smallest = 0; // smallest int 
		double sum = 0; // add all values to find the average 
		float avg = 0; // research float function 
		for (int g = 0; g < totalexp.length; g++) {
			if (totalexp[g] > totalexp[biggest]) {
				biggest = g; // assign variable for biggest 
			}
			if (totalexp[g] < totalexp[smallest]) {
				smallest = g; // assign variable for smallest 
			}
			sum += totalexp[g]; // sum of all values 
		}
		avg = (float) ((biggest + smallest) / 2); // function to obtain the average

		System.out.println("Biggest: " + fnames[biggest] + " " + lnames[biggest] + " ("
				+ String.format("%.2f", totalexp[biggest]) + ")");
		System.out.println("Smallest: " + fnames[smallest] + " " + lnames[smallest] + " ("
				+ String.format("%.2f", totalexp[smallest]) + ")");
		System.out.println("Average: " + String.format("%.2f", (sum / totalexp.length)));
	}
}