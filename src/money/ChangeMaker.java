package money;

import java.util.*;

public class ChangeMaker {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter the cost of the item: ");
		double cost = kb.nextDouble();
		System.out.println("Please enter the amount provided by the customer: ");
		double tender = kb.nextDouble();
		
		if (cost > tender) {
			System.out.println("Error: Cost of item exceeds amount provided by customer.");
		}
		
		//Need a method to calculate change
		//Need a method to handle user input
	}
}
