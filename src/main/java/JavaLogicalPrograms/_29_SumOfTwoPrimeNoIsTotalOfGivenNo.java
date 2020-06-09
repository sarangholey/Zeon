package JavaLogicalPrograms;

public class _29_SumOfTwoPrimeNoIsTotalOfGivenNo {

	public static void main(String[] args) {
		
		// for a number ex 34 is not prime number
		// 34 = 3(prime no) + 31(prime no)
		// 34 = 5(prime no) + 29(prime no)
		// 34 = 11(prime no) + 23(prime no)
		// 34 = 17(prime no) + 17(prime no)
		// 11 is not expressed in 2 prime no total
		
		//System.out.println(checkPrimeNo(17));
		
		int num = 34;
		boolean flag = false;
		
		for (int i = 2; i <= num/2; i++) {
			if(checkPrimeNo(i))
			{
				if(checkPrimeNo(num-i))
				{
					System.out.println(num + " = " + i + " + " + (num-i));
					flag = true;
				}
			}	
		}
		if(!flag)
		{
			System.out.println(num+" cannot be expressed as the sum of Two prime numbers");
		}

	}
	
	public static boolean checkPrimeNo(int num)
	{
		boolean isPrime = true;
		for (int i = 2; i <=num/2; i++) 
		{
			if(num%i==0)
			{
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

}
