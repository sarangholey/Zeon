package JavaLogicalPrograms2;

public class _2_SpecialCharRemoveFromString {

	public static void main(String[] args) {
		
		// by using regular expression 
		// [^a-zA-Z0-9]
		
		String s = "#%$#%$*!! Hello There *&*&%$%$^ good";
		
		s = s.replaceAll("[^a-zA-Z0-9]", " ");
		
		System.out.println(s);
		String str[] = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			if (str[i].isEmpty()) {
				
			}
			else {
				System.out.print(str[i] + " ");
			}
		}
	}

}
