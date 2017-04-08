package money;

import java.util.*;

public class ChangeMaker {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double cost, tender, change;
		double[] uInput = new double[2];

		uInput = UserInput(kb);
		// set method return value equal to method call
		cost = uInput[0];
		tender = uInput[1];

		change = ChangeCalc(cost, tender);

		TenderCalc(change);

	}// end main

	public static double[] UserInput(Scanner kb) {
		double[] uInput = new double[2];
		System.out.println("Please enter the cost of the item: ");
		double cost = kb.nextDouble();
		System.out.println("Please enter the amount provided by the customer: ");
		double tender = kb.nextDouble();
		while (cost > tender) {
			System.out.println("Error: Cost of item exceeds amount provided by customer.");
			System.out.println("Please enter the cost of the item: ");
			cost = kb.nextDouble();
			System.out.println("Please enter the amount provided by the customer: ");
			tender = kb.nextDouble();
		}
		uInput[0] = cost;
		uInput[1] = tender;
		return uInput;

	}

	public static double ChangeCalc(double cost, double tender) {
		double change = tender - cost;
		if (change == 0.0) {
			System.out.println("No change is due.");
		}
		return change;
	}

	public static void TenderCalc(double change) {
		double ten = 1000, five = 500, one = 100, quarter = 25, dime = 10, nickel = 5, penny = 1;
		double changeInt = (change);
		changeInt *= (int) 100;

		while (changeInt > 0) {
			if (changeInt >= ten) {
				int tens = (int) ((int) changeInt / ten);
				System.out.println("tens: " + tens);
				changeInt = changeInt % 1000;
			} else if (changeInt >= five) {
				int fives = (int) ((int) changeInt / five);
				System.out.println("fives: " + fives);
				changeInt %= 500;
			} else if (changeInt >= one) {
				int ones = (int) ((int) changeInt / one);
				System.out.println("ones: " + ones);
				changeInt %= 100;
			} else if (changeInt >= quarter) {
				int quarters = (int) ((int) changeInt / quarter);
				System.out.println("quarters: " + quarters);
				changeInt %= 25;
			} else if (changeInt >= dime) {
				int dimes = (int) ((int) changeInt / dime);
				System.out.println("dimes: " + dimes);
				changeInt %= 10;
			} else if (changeInt >= nickel) {
				int nickels = (int) ((int) changeInt / nickel);
				System.out.println("nickels: " + nickels);
				changeInt %= 5;
			} else if (changeInt >= penny) {
				double pennyRound = changeInt % 1;
				int pennies = (int) ((int) changeInt / penny);
				if (pennyRound - .1 > 0) {
					pennies += 1;
				}
				System.out.println("pennies: " + pennies);
				changeInt = 0;
			}
		}
	}
}