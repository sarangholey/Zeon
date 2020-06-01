package Javasessions;

public class Exceptionhandiling {
	String text = "Hello";
	
	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("B");
		Exceptionhandiling ex = new Exceptionhandiling();
		ex = null;
		try {
			int i = 9/0;
			System.out.println("Value of i is "+ i); // this line will not get executed
		}
		//catch(Throwable e) // can be used
		//catch(Exception e) // can be used if exception name is not remembered
		catch (ArithmeticException e) // proper exception name should be there to catch it
		{							  // if any mismatch in exception name it wont be catches
			// report of the exception
			e.printStackTrace();
			// user defined message
			System.err.println("ArithmeticExcetion occured");
		}
		try {
			System.out.println(ex.text);
		} catch (NullPointerException e) {
			System.out.println("Null pointer exception will occur");
		}
		System.out.println("C");
		System.out.println("D");
	}
}
