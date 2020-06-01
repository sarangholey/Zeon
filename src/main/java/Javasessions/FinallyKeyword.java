package Javasessions;

public class FinallyKeyword {
	public static void main(String[] args) {
		int p = getNumber();
		System.out.println(p);
	}
	@SuppressWarnings("finally")
	public static int getNumber() {
			int a = 10;
			int b = 20;
			try {
				int c = a/0;
				return c; // this is return inside try block
			} catch (NullPointerException e) {
				return -1; // so we have write return here also 
				// to complete method return
			}
			finally
			{
				System.out.println("Bye....");
				int age = 100;
				// return age;
			}
		}
	}