package JavaLogicalPrograms;

public class _24_PrimeNumberCheck {

	public static void main(String[] args) {
		
		// a number is divisible by only by 1 and by itself
		// 2 is the lowest prime number and 1 is not counted in orime number
		// ex - 13, 27, 29
		
		int num = 13;
		boolean flag = false;
		
		for (int i = 2; i <=num/2; i++) {
			if(num % i == 0)
			{
				flag = true;
				break;
			}
		}
		
		if(!flag)
		{
			System.out.println(num +" is a prime number");
		}
		else
		{
			System.out.println(num +" is not a prime number");
		}

	}

}
