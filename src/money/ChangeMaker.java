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
		int cost = (int)Math.round(kb.nextDouble()*100);
		System.out.println("Please enter the amount provided by the customer: ");
		int tender = (int)Math.round(kb.nextDouble()*100);
		while (cost > tender) {
			System.out.println("Error: Cost of item exceeds amount provided by customer.");
			System.out.println("Please enter the cost of the item: ");
			cost = (int)Math.round(kb.nextDouble()*100);
			System.out.println("Please enter the amount provided by the customer: ");
			tender = (int)Math.round(kb.nextDouble()*100);
			
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
				int tens = change / ten;
				System.out.println("tens: " + tens);
				change %= 1000;
			} else if (change >= five) {
				int fives = change / five;
				System.out.println("fives: " + fives);
				change %= 500;
			} else if (change >= one) {
				int ones = change / one;
				System.out.println("ones: " + ones);
				change %= 100;
			} else if (change >= quarter) {
				int quarters = change / quarter;
				System.out.println("quarters: " + quarters);
				change %= 25;
			} else if (change >= dime) {
				int dimes = change / dime;
				System.out.println("dimes: " + dimes);
				change %= 10;
			} else if (change >= nickel) {
				int nickels = change / nickel;
				System.out.println("nickels: " + nickels);
				change %= 5;
			} else {
				int pennies = change / penny;
				System.out.println("pennies: " + pennies);
				change %= 1;
			}
		}
	}
}