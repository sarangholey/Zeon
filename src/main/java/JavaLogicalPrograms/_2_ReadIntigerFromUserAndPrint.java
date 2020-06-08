package JavaLogicalPrograms;

import java.util.Scanner;

public class _2_ReadIntigerFromUserAndPrint {
	
	public static void main(String[] args) {

		intigerReaderPrinter();

	}

	/**
	 * @author Sarang
	 * @return void
	 * @param none
	 * @apiNote This is a utility to read number from user and print on the console
	 */
	public static void intigerReaderPrinter() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter a number: ");

		int number = scan.nextInt();

		System.out.println("The entered number from user is: " + number);
	}
}
