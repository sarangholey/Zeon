package JavaLogicalPrograms;

public class _16_FactorialOfNumbet {

	public static void main(String[] args) {
		
		// factorial ex - !5 = 5x4x3x2x1 = 120

		int number = 5; // for 4 - 24, for 0 its 1
		int fact = 1;
		
		for (int i =1; i <=number; i++)
			fact = fact * i;
		
		System.out.println("Factorial of "+number+" is "+fact);
		}
		
	}

