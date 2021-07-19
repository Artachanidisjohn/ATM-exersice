package atm;

import java.util.Scanner;

public class Atmm {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int attempts = 0;
		boolean flag = true;

		
		while (flag) {
			System.out.println("Welcome to Piraues Bank \nPlease Enter pin:");
			int pin = input.nextInt();
			attempts++;
			int length = String.valueOf(pin).length();

			while (length < 4 || length > 4) { /* While PIN is wrong! */
				System.out.println("Wrong pin code");
				System.out.println("Please enter Pin:");
				pin = input.nextInt();
				length = String.valueOf(pin).length();
				attempts++;
				if (attempts == 3) {
					System.out.println("Pin BLOCKED!");
					flag = false;
					break;
				}


			}
			if (length == 4) {
				System.out.println("Welcome !!!");
				System.out.println("Insert 1 for WITHDRAWAL ");
				System.out.println("Insert 2 for DEPOSITION ");
				System.out.println("Insert 3 to EXIT ");
				System.out.println("Please insert number: ");
				int x = input.nextInt();

				if (x == 1) {
					System.out.println("--WITHDRAWAL OPTIONS BELOW--");
					System.out.println("Insert 1 to withdrawl 20$");
					System.out.println("Insert 2 to withdrawl 40$");
					System.out.println("Insert 3 to withdrawl 80$");
					System.out.println("Insert 4 to withdrawl 200$");
					System.out.println("please insert number :");

					int y = input.nextInt();
					if (y == 1 || y == 2 || y == 3 || y == 4) {
						System.out.println("Withdrawl complete succesfully!!");
						break;
					} else if (y == 5) {
						System.out.println("Transaction canceled!!");
					}
					break;
				}

				if (x == 2) {
					System.out.println("--DEPOSITION OPTIONS BELOW--");
					System.out.println("Insert 1 to deposit 20$");
					System.out.println("Insert 2 to deposit 40$");
					System.out.println("Insert 3 to deposit 80$");
					System.out.println("Insert 4 to deposit 200$");
					System.out.println("please insert number :");
					int g = input.nextInt();
					if (g == 1 || g == 2 || g == 3 || g == 4) {
						System.out.println("Deposit complete succesfully!!");
						break;
					} else if (g == 5) {
						System.out.println("Transaction canceled!!");
					}
					break;
				}

				if (x == 3) {
					System.out.println("Transaction canceled!!!");
					break;
				}
			}

		}

	}
}

	
