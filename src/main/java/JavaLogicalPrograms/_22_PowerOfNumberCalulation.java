package JavaLogicalPrograms;

public class _22_PowerOfNumberCalulation {

	public static void main(String[] args) {
		
		// 3^4 = 3x3x3x3 = 81
		
		int base = 3;
		int exponent = 4;
		
		// using user logic
//		long result = 1;
//		
//		while(exponent != 0)
//		{
//			result = result * base; // result *= base;
//			--exponent;
//		}
//		
//		System.out.println("The result is " + result);

		// using pow function from Math class
		System.out.println("The result is " + Math.pow(base, exponent));
	}

}
