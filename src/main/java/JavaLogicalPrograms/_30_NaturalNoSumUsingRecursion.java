package JavaLogicalPrograms;

public class _30_NaturalNoSumUsingRecursion {

	public static void main(String[] args) {
		
		// +ve numbers are called natural number 
		// Zero is not a natural number
		// a method calling itself called recursion
		// 5+4+3+2+1 = 15
		
		int number = 5;  
		int sum = addNum(number);
		System.out.println("Sum is "+ sum);
		

	}
	
	public static int addNum(int num)
	{
		if(num != 0)
		{
			return num + addNum(num-1);
		}
		else {
			return num;
		}
	}

}
