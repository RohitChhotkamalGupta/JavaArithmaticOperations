package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Operations operations = new Operations();
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		int number1 = 0;
		int number2 = 0;
		boolean cont = true;
		while (cont) {
			System.out.println("\n1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multilication");
			System.out.println("4. Division");
			System.out.println("5. Modulus");
			System.out.println("6. Exit");
			try {
				System.out.print("\nEnter your choice (eg. 1 for Adding, 4 for Dividing) : ");
				choice = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Try entering valid choice..\nExiting");
				break;
			}
			switch (choice) {
			case 1:
				try {
					System.out.print("Enter first number : ");
					number1 = sc.nextInt();
					System.out.print("Enter second number : ");
					number2 = sc.nextInt();
				} catch (Exception e) {
					System.out.println("Enter valid numbers");
					cont=false;
					break;
				}
				System.out
						.println("Sum of " + number1 + " and " + number2 + " is : " + operations.add(number1, number2));
				break;
			case 2:
				try {
					System.out.print("Enter first number : ");
					number1 = sc.nextInt();
					System.out.print("Enter second number : ");
					number2 = sc.nextInt();
				} catch (Exception e) {
					System.out.println("Enter valid numbers");
				}
				System.out.println("Subtraction of " + number1 + " and " + number2 + " is : "
						+ operations.subtract(number1, number2));
				break;
			case 3:
				try {
					System.out.print("Enter first number : ");
					number1 = sc.nextInt();
					System.out.print("Enter second number : ");
					number2 = sc.nextInt();
				} catch (Exception e) {
					System.out.println("Enter valid numbers");
				}
				System.out.println("Multiplication of " + number1 + " and " + number2 + " is : "
						+ operations.multiplication(number1, number2));
				break;
			case 4:
				try {
					System.out.print("Enter first number : ");
					number1 = sc.nextInt();
					System.out.print("Enter second number : ");
					number2 = sc.nextInt();
					int answer = operations.division(number1, number2);
					if (answer == 0) {
						System.out.println("Cannot divide by 0");
					} else {
						System.out.println("Division of " + number1 + " and " + number2 + " is : "
								+ operations.division(number1, number2));
					}
				} catch (Exception e) {
					System.out.println("Enter valid numbers\nExiting..");
					cont = false;
				}
				
				break;
			case 5:
				try {
					System.out.print("Enter first number : ");
					number1 = sc.nextInt();
					System.out.print("Enter second number : ");
					number2 = sc.nextInt();
				} catch (Exception e) {
					System.out.println("Enter valid numbers");
				}
				int answer2 = operations.modulus(number1, number2);
				if (answer2 == 0) {
					System.out.println("Cannot divide by 0");
				} else {
					System.out.println("Modulus of " + number1 + " and " + number2 + " is : "
							+ operations.modulus(number1, number2));
				}
				break;
			case 6:
				System.out.println("Exiting..");
				cont = false;
				break;
			default:
				System.out.println("Enter valid choice");
			}
		}
		sc.close();
	}
}

class Operations {
	public int add(int num1, int num2) {
		return num1 + num2;//adding numbers
	}

	public int subtract(int num1, int num2) {
		return num1 - num2;//substracting numbers
	}

	public int multiplication(int num1, int num2) {
		return num1 * num2;//multiplying numbers
	}

	public int division(int num1, int num2) {
		if (num2 == 0) {
			return 0;//returning 0 if denominator is 0
		} else {
			return num1 / num2;//dividing numbers
		}
	}

	public int modulus(int num1, int num2) {
		if (num2 == 0) {
			return 0;//returning 0 if denominator is 0
		} else {
			return num1 % num2;//returning modulus of numbers
		}
	}
}
