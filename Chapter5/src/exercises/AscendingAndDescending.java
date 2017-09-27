package exercises;

import java.util.Scanner;

public class AscendingAndDescending {

	private static Scanner input;

	public static void main(String[] args) {
		input = new Scanner (System.in);
		System.out.print("Please enter an integer: ");
		int number1 = input.nextInt();
		System.out.print("Please enter an integer: ");
		int number2 = input.nextInt();
		System.out.print("Please enter an integer: ");
		int number3 = input.nextInt();
		
	if (number1 > number2) {
		int temp = number1;
		number1 = number2;
		number2 = temp;
	}
	
	if (number2 > number3) {
		int temp = number2;
		number2 = number3;
		number3 = temp;
	}
	if (number1 > number2) {
		int temp = number1;
		number1 = number2;
		number2 = temp;
	}
		
		System.out.println("The sorted numbers are " + number1 + " " + number2 + " " + number3 + " ");
		
		
		
		
		
	}
		
		
		
	}


