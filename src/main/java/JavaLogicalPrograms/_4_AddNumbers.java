package JavaLogicalPrograms;

import java.util.Scanner;

public class _4_AddNumbers {

	public static void main(String[] args) {
		
		System.out.println("Please enter 2 numbers with space to get addition");
		
		Scanner sc = new Scanner(System.in);
		
		int numOne = sc.nextInt();
		int numTwo = sc.nextInt();
		
		System.out.println("Addition of entered no is - " + (numOne+numTwo));

	}

}
