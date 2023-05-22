import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the price of this item?");
		double itemPrice = sc.nextDouble();
		System.out.println("How much money have you provided for the item");
		double moneyTendered = sc.nextDouble();
		double diff = moneyTendered - itemPrice;
		sc.close();

		if (moneyTendered == itemPrice) {
			System.out.println("Thank you for your business. Have a nice day");

		} else if (moneyTendered > itemPrice) {
			System.out.println("Result: " + changeMaker(diff));

		} else if (moneyTendered < itemPrice) {
			System.out.println("Result: Error message");
		}
	}

	public static String changeMaker(double tendered) {
		String result = "";
		double remainder = tendered;
		int twentyCount = (int) (tendered / 20.00);
		if (twentyCount > 0) {
			if (twentyCount > 1) {
				result += twentyCount + " twenty dollar bills, ";
			} else {
				result += twentyCount + " twenty dollar bill, ";
			}
			
			remainder = tendered % 20.00;
		}
		tendered = (remainder);
		int tenCount = (int) (tendered / 10.00);
		if (tenCount > 0) {
			if (tenCount > 1) {
				result += tenCount + " ten dollar bills, ";
			} else {
				result += tenCount + " ten dollar bill, ";
			}

			remainder = tendered % 10.00;
		}
		tendered = (remainder);

		int fiveCount = (int) (tendered / 5.00);
		if (fiveCount > 0) {
			if (fiveCount > 1) {
				result += fiveCount + " five dollar bills, ";
			} else {
				result += fiveCount + " five dollar bill, ";
			}

			remainder = tendered % 5.00;
		}
		tendered = (remainder);

		int oneCount = (int) (tendered / 1.00);
		if (oneCount > 0) {
			if (oneCount > 1) {
				result += oneCount + " one dollar bills, ";
			} else {
				result += oneCount + " one dollar bill, ";
			}

			remainder = tendered % 1.00;
		}
		tendered = remainder + .00005;

		int quarterCount = (int) (tendered / 0.25);
		if (quarterCount > 0) {
			if (quarterCount > 1) {
				result += quarterCount + " quarters, ";
			} else {
				result += quarterCount + " quarter, ";
			}

			remainder = tendered % 0.25;
		}
		tendered = remainder;

		int dimeCount = (int) (tendered / 0.10);
		if (dimeCount > 0) {
			if (dimeCount > 1) {
				result += dimeCount + " dimes, ";
			} else {
				result += dimeCount + " dime, ";
			}

			remainder = tendered % 0.10;
		}
		tendered = remainder;

		int nickelCount = (int) (tendered / 0.05);
		if (nickelCount > 0) {
			if (nickelCount > 1) {
				result += nickelCount + " nickels, ";
			} else {
				result += nickelCount + " nickel, ";
			}

			remainder = tendered % 0.05;
		}
		tendered = remainder + .000051;

		int pennyCount = (int) (tendered / 0.01);
		if (pennyCount > 0) {
			if (pennyCount > 1) {
				result += pennyCount + " pennies. ";
			} else {
				result += pennyCount + " penny. ";
			}
			
			remainder = tendered % 0.01;
		}
		tendered = remainder;
		return result;
	}
}

