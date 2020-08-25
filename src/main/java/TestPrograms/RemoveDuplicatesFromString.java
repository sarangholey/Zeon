package TestPrograms;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {

		String str = "Marry";
		String updatedStr = "";
		Set set = new HashSet();
		char[] ch = str.toCharArray();
		for(int i=0; i<ch.length; i++)
		{
			 set.add(ch[i]);
		}
		
		

		System.out.println(set);
	}

}
