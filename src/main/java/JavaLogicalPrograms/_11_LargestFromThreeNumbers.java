package JavaLogicalPrograms;

public class _11_LargestFromThreeNumbers {

	public static void main(String[] args) {

		int a = 100;
		int b = 200;
		int c = 300;

		// By if else condition
		if(a==b && b==c)
		{
			System.out.println("three numbers are smae");
		}
		else
		{
			if(a>b && a>c)
			{
				System.out.println("a is greatest no");
			}
			else if(b>c) {
				System.out.println("b is greatest no");
			}
			else {
				System.out.println("c is gretest no");
			}
		}
		
		// By using nested if
		if(a>=b)
		{
			if(a>=c)
			{
				System.out.println("a is greatest no");
			}
			else {
				System.out.println("c is gretest no");
			}
		}
		else {
			if(b>=c)
			{
				System.out.println("b is greatest no");
			}
			else {
				System.out.println("c is gretest no");
			}
		}
	}

}
