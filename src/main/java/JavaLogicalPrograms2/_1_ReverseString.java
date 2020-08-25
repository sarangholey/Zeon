package JavaLogicalPrograms2;

public class _1_ReverseString {

	public static void main(String[] args) {

		// using for loop
		String str = "Selenium Hello";

		String rev = "";

		int len = str.length();

		for (int i = len - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}

		System.out.println(rev);
		
		// using string buffer class
		StringBuffer sf = new StringBuffer(str);
		StringBuffer rev1 = sf.reverse();
		System.out.println(rev1);
		
		

	}

}
