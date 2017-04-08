package money;

import java.util.*;

public class ChangeMaker {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double cost, tender, change;
		double[] uInput = new double[2];

		uInput = UserInput(kb);
		// always set the array name = to the method you call to store values.
		cost = uInput[0];
		tender = uInput[1];
		change = CalcChange(cost, tender);

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

	public static double CalcChange(double cost, double tender) {
		double change = tender - cost;
		System.out.println(change);
		return change;
	}
}
