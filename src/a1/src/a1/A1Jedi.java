package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int count = scan.nextInt(); // counter for the beginning of the input code
		String[] groceryItem = new String[count]; // define the type of items to be displayed

		for (int i = 0; i < count; i++) {
			groceryItem[i] = scan.next(); // go through the array to find the corresponding grocery item
			scan.nextDouble(); // for the price input, must be included although its not in the output
		}
		int object = scan.nextInt(); // next scan for the amount of each item bought
		int[] numberOfCustomers = new int[count]; // how many customers bought each item
		int[] howManyItems = new int[count]; // how many items were bought
		for (int j = 0; j < object; j++) {
			boolean[] buyer = new boolean[count]; // so item repeated wouldn't be counted twice
			scan.next();
			scan.next();
			int numberOfItems = scan.nextInt();
			for (int n = 0; n < numberOfItems; n++) {
				int grocPerCustomer = scan.nextInt();
				String groceryItem1 = scan.next();
				int index = 0; // matching the corresponding customer to position
				for (int h = 0; h < count; h++) {
					if (groceryItem1.contentEquals(groceryItem[h])) {
						index = h;
					}
				}
				howManyItems[index] += grocPerCustomer;
				if (!buyer[index])
					;
				numberOfCustomers[index] += 1;

				buyer[index] = true;
			}
		}
		for (int h = 0; h < count; h++) {
			if (numberOfCustomers[h] > 0) {
				System.out
						.println(numberOfCustomers[h] + " customers bought " + howManyItems[h] + " " + groceryItem[h]);
			} else {
				System.out.println("No customers bought " + groceryItem[h]);

			}

		}
	}

}