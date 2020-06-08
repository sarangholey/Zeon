package JavaLogicalPrograms;

import java.util.Scanner;

public class _9_OddEvenNoCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number to check odd or even");
		
		int num = sc.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println("Entered no is even");
		}
		else {
			System.out.println("Entered no is odd");
		}

	}

}
