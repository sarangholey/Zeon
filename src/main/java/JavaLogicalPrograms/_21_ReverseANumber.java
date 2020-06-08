package JavaLogicalPrograms;

public class _21_ReverseANumber {

	public static void main(String[] args) {
		
		// 1234 to 4321
		
		int number = 1234; // 222 1 12345
		int rev = 0;
		
		while(number !=0)
		{
			int n = number % 10;
			rev = rev * 10 + n;
			number = number/10;	
		}
		
		System.out.println("The reverse number is : " + rev);
	}

}
