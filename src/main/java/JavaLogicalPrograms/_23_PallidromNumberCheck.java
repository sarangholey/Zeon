package JavaLogicalPrograms;

public class _23_PallidromNumberCheck {

	public static void main(String[] args) {
		
		// pallindrome - reverse of a number is same as actual no
		// 121 - reverse = 121
		
		int num = 121; // 1211
		int reverse = 0;
		int actualNumber = num;
		
		while(num != 0)
		{
			int n = num%10;
			reverse = reverse*10 + n;
			num = num/10;
		}
		
		if(actualNumber == reverse)
		{
			System.out.println(actualNumber + " is a pallindrome no" );
		}
		else {
			System.out.println(actualNumber + " is not a pallindrome no" );
		}
	}

}
