package JavaLogicalPrograms;

public class _8_SwapTwoNumbers {

	public static void main(String[] args) {
		
		// with temp or 3rd variable
		int a = 10;
		int b = 20;
		System.out.println("before swapping");
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		
		System.out.println("After swapping");
		
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("a :"+a);
		System.out.println("b :"+b);
		
		// with temp or 3rd variable
		int c = 10;
		int d = 20;
		System.out.println("before swapping");
		System.out.println("c :"+c);
		System.out.println("d :"+d);
		
		c = c-d;
		d = c+d;
		c = d-c;
		System.out.println("After swapping");
		System.out.println("c :"+c);
		System.out.println("d :"+d);
		
		
	}

}
