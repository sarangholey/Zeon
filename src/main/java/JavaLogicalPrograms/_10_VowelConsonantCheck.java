package JavaLogicalPrograms;

public class _10_VowelConsonantCheck {

	public static void main(String[] args) {
		
		// Vowels - a e i o u
		char ch = 'z';
		
		// By if case
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		{
			System.out.println("Entered character "+ch+" is vowel");
		}
		else {
			System.out.println("Entered character "+ch+" is consonent");
		}
		
		// By switch case statement
		switch (ch) {
		case 'a':
		case 'b':
		case 'c':
		case 'd':
		case 'e':
			System.out.println("Entered character "+ch+" is vowel");
		default:
			System.out.println("Entered character "+ch+" is consonent");
			break;
		}
		
	}
	

}
