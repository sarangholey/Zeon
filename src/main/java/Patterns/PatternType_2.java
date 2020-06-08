package Patterns;

public class PatternType_2 
{

	public static void main(String[] args)
	{
//		1
//		12
//		123
//		1234
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.print("\n");
		}
		
		System.out.println("______________________");
		System.out.println();
		
//		1234
//		123
//		12
//		1
		
		for(int i=4;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.print("\n");
		}
		
		System.out.println("______________________");
		System.out.println();
		
//		1
//		22
//		333
//		4444
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		System.out.println("______________________");
		System.out.println();
		
//		1
//		23
//		456
//		78910
		
		int count = 0;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				count = count + 1;
				System.out.print(count);
			}
			System.out.println();
		}

		System.out.println("______________________");
		System.out.println();
		
//		1 
//		1 2 1 
//		1 2 3 2 1 
//		1 2 3 4 3 2 1 
//		1 2 3 4 5 4 3 2 1
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j + " ");
			}
			for(int k=i-1;k>=1;k--)
			{
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}

}
