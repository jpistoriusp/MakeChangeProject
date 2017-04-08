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
		double numTens, changeRemainder;
		while (change > 0.0) {
			if (change >= 10.0) {
				double tens = change / 10.0;
				numTens = (int)tens;
				changeRemainder = change - (10*tens);
				System.out.println("The remaining change is: "+changeRemainder);
				System.out.println("The number of Tens is: "+numTens);
//			}
//			if (change >= 5.0) {
//				double fives = change / 5.0;
//			}
//			if (change >= 1.0) {
//				double ones = change % 1.0;
//			}
//			if (change >= 0.25) {
//				double quarters = change % 0.25;
//			}
//			if (change >= 0.10) {
//				double dimes = change % 0.10;
//			}
//			if (change >= 0.5) {
//				double nickels = change % 0.05;
//			}
//			if (change >= 0.01) {
//				double pennies = change % 0.01;
//			}
		}
	}
	}
}
