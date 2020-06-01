package Javasessions;

public class StringManipulations {
	public static void main(String[] args) {
		String s = "This is my java code i am so happy";
		//          0123456789
		// to find out count of characters in string
		System.out.println(s.length());
		// Lowest index of string is 0 - 'T'
		// and highest index is 38-1=37 - 'y'
		
		// to find a specific char position
		System.out.println(s.charAt(3)); // O/P - 3
		// System.out.println(s.charAt(38)); 
		// O/P - stringIndexOutOfBoundException
		
		// to find index of a specific char from string
		System.out.println(s.indexOf('m')); // O/P - 8
		// to find index of specific word from string
		System.out.println(s.indexOf("my")); // O/P - 8
		// finding out word which is not present in string
		System.out.println(s.indexOf("Selenium")); // O/P - "-1"
		// use case
		String str = "Welcome Tom";
		if(str.indexOf("Tom")>=0)
		{
			System.out.println("Correct user name is displayed");
		}
		else{
			System.out.println("Incorrect msg");
		}

		// to find 2nd occurrence of char from string
		System.out.println(s.indexOf('i', 3)); // O/P - 5
		System.out.println(s.indexOf('i', s.indexOf('i')+1)); // O/P - 5
		
		// to make all char from string uppercase
		System.out.println(s.toUpperCase());
		// to make all char from string lowercase
		System.out.println(s.toLowerCase());
		
		// to remove the spaces from the end points of string
		String st = "  galaxy   ";
		System.out.println(st.trim()); // O/P - "galaxy"
		
		// to replace spaces or char from string
		String dob = "12:12:1990";
		System.out.println(dob.replace(':', '-')); // O/P - 12-12-1990
		
		// to compare two strings 
		String s1 = "Hello there";
		String s2 = "Hello there";
		String s3 = "hello there";
		System.out.println(s1.equals(s2)); // O/P - true
		System.out.println(s1.equals(s3)); // O/P - false
		System.out.println(s1.equalsIgnoreCase(s3)); // O/P - true
		
		// to check char sequence or word from a string
		System.out.println(s1.contains("Hello")); // O/P - false
		
		// to fetch word or char sequence from string
		System.out.println(s1.substring(6, 11)); // O/P - "there"
		
		// to fetch all char form a string as individual
		String name = "Smith";
		char c[] = name.toCharArray();
		for(int p=0;p<c.length;p++)
		{
			System.out.println(c[p]);
		}
//		O/P - 	S
//				m
//				i
//				t
//				h
		// to split the string on basis of some char
		String z = "java-python-dotnet";
		String lang[] = z.split("-");
		for(int i=0;i<lang.length;i++)
		{
			System.out.println(lang[i]);
		}
//		O/P - 	java
//				python
//				dotnet
		// reverse words form a string
		String stm = "Good Bye";
		String revWord[] = stm.split(" ");
		System.out.println(revWord[1]+" "+revWord[0]); // O/P - "Bye Good"
		
	}
}
