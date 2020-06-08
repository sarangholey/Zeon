package JavaLogicalPrograms;

import java.util.Scanner;

public class _3_ReadIntigerFromUserAndPrint {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter desired text");
		
		String textFromUser = sc.nextLine();
		
		System.out.println(textFromUser.toUpperCase());
	}
	
}
