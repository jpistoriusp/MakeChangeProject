package money;

import java.util.*;

public class ChangeMaker {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double cost, tender, change;
		double[] uInput = new double[2];

		uInput = UserInput(kb);
		// always set return value equal to the method that you call
		cost = uInput[0];
		tender = uInput[1];

		change = ChangeCalc(cost, tender);

		TenderCalc(change);

		// Need a method to subtract tender values from change amount.

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
		System.out.println(change);
		return change;
	}

	public static void TenderCalc(double change) {
		double ten=10.0, five=5.0, one=1.0, quarter=0.25, dime=0.10, nickel=0.05, penny=0.01, changeRemainder;
		while (change > 0.0) {
			if (change >= ten) {
				double tens = change / ten;
				double numTens = (int)tens;
				changeRemainder = change - (ten * numTens);
				System.out.println("The number of tens: " + numTens);
				System.out.println("The remaining change is: " + changeRemainder);
				change = changeRemainder;
			}
			if (change >= five) {
				double fives = change / five;
				double numFives = (int)fives;
				changeRemainder = change - (five * numFives);
				System.out.println("The number of fives: " + numFives);
				System.out.println("The remaining change is: " + changeRemainder);
				change = changeRemainder;
			}
			if (change >= one) {
				double ones = change / one;
				double numOnes = (int)ones;
				changeRemainder = change - (one * numOnes);
				System.out.println("The number of ones: " + numOnes);
				System.out.println("The remaining change is: " + changeRemainder);
				change = changeRemainder;
			}
			if (change >= quarter) {
				double quarters = change / quarter;
				double numQuarters = (int)quarters;
				changeRemainder = change - (quarter * numQuarters);
				System.out.println("The number of quarters: " + numQuarters);
				System.out.println("The remaining change is: " + changeRemainder);
				change = changeRemainder;
			}
			if (change >= dime) {
				double dimes = change / dime;
				double numDimes = (int)dimes;
				changeRemainder = change - (dime * numDimes);
				System.out.println("The number of dimes: " + numDimes);
				System.out.println("The remaining change is: " + changeRemainder);
				change = changeRemainder;
			}
			if (change >= nickel) {
				double nickels = change / nickel;
				double numNickels = (int)nickels;
				changeRemainder = change - (nickel * numNickels);
				System.out.println("The number of nickels: " + numNickels);
				System.out.println("The remaining change is: " + changeRemainder);
				change = changeRemainder;
			}
			if (change >= penny) {
				double pennies = change / penny;
				double numPennies = (int)pennies+1;
				changeRemainder = change - (penny * numPennies);
				System.out.println("The number of pennies: " + numPennies);
				System.out.println("The remaining change is: " + changeRemainder);
				change = 0;
			}
		}
	}
}