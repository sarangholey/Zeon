package JavaLogicalPrograms;

public class _20_CountNoOfDigitsInInteger {

	public static void main(String[] args) {
		
		// 1234 - 4 
		// 12345 - 5
		// usecase - to check the transation id having 6 digits
		// mobile number should be 10 digits
		int number = 1234;
		int count = 0;
		
		while(number != 0)
		{
			number = number/10;
			++count;
		}
		
		System.out.println("number of digits : "+count);

	}

}
