package money;

import java.util.*;

public class ChangeMaker {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int cost, tender, change;
		int[] uInput = new int[2];

		uInput = UserInput(kb);
		// set method return value equal to method call
		cost = uInput[0];
		tender = uInput[1];

		change = ChangeCalc(cost, tender);

		TenderCalc(change);

	}// end main

	public static int[] UserInput(Scanner kb) {
		int[] uInput = new int[2];
		System.out.println("Please enter the cost of the item: ");
		int cost = (int) Math.round(kb.nextDouble() * 100);
		System.out.println("Please enter the amount provided by the customer: ");
		int tender = (int) Math.round(kb.nextDouble() * 100);
		while (cost > tender) {
			System.out.println("Error: Cost of item exceeds amount provided by customer.");
			System.out.println("Please enter the cost of the item: ");
			cost = (int) Math.round(kb.nextDouble() * 100);
			System.out.println("Please enter the amount provided by the customer: ");
			tender = (int) Math.round(kb.nextDouble() * 100);

		}
		uInput[0] = cost;
		uInput[1] = tender;
		return uInput;

	}

	public static int ChangeCalc(int cost, int tender) {
		int change = tender - cost;
		if (change == 0) {
			System.out.println("No change is due.");
		}
		return change;
	}

	public static void TenderCalc(int change) {
		int ten = 1000, five = 500, one = 100, quarter = 25, dime = 10, nickel = 5, penny = 1;
		while (change > 0) {
			if (change >= ten) {
				int numTens = change / ten;
				if (numTens == 1) {
					System.out.println(numTens + " ten dollar bill");
				} else {
					System.out.println(numTens + " ten dollar bills");
				}
				change %= ten;
			} else if (change >= five) {
				int numFives = change / five;
				if (numFives == 1) {
					System.out.println(numFives + " five dollar bill");
				} else {
					System.out.println(numFives + " five dollar bills");
				}
				change %= five;
			} else if (change >= one) {
				int numOnes = change / one;
				if (numOnes == 1) {
					System.out.println(numOnes + " one dollar bill");
				} else {
					System.out.println(numOnes + " one dollar bills");
				}
				change %= one;
			} else if (change >= quarter) {
				int numQuarters = change / quarter;
				if (numQuarters == 1) {
					System.out.println(numQuarters + " quarter");
				} else {
					System.out.println(numQuarters + " quarters");
				}
				change %= quarter;
			} else if (change >= dime) {
				int numDimes = change / dime;
				if (numDimes == 1) {
					System.out.println(numDimes + " dime");
				} else {
					System.out.println(numDimes + " dimes");
				}
				change %= dime;
			} else if (change >= nickel) {
				int numNickels = change / nickel;
				if (numNickels == 1) {
					System.out.println(numNickels + " nickel");
				} else {
					System.out.println(numNickels + " nickels");
				}
				change %= nickel;
			} else {
				int numPennies = change / penny;
				if (numPennies == 1) {
					System.out.println(numPennies + " penny");
				} else {
					System.out.println(numPennies + " pennies");
				}
				change %= penny;
			}
		}
	}
}