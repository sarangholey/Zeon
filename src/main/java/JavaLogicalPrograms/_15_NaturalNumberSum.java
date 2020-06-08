package JavaLogicalPrograms;

public class _15_NaturalNumberSum {

	public static void main(String[] args) {
		
		// for 100 its 1+2+3+......+100 which is 5050
		int num = 100;
		int sum = 0;
		
		// By for loop
		for (int i = 0; i <= num; i++) {
			sum = sum + i;
		}
		
		System.out.println("Sum for natural no "+num+" is : "+ sum);
		System.out.println("--------------");
		
		// By While loop
		int sum1 = 0;
		int k = 1;
		while(k<=num)
		{
			sum1 = sum1 + k;
			k++;
		}
		System.out.println("Sum for natural no "+num+" is : "+ sum1);
	}

}
