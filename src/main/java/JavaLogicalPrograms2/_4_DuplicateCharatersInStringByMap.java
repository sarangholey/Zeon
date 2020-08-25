package JavaLogicalPrograms2;

import java.util.LinkedHashMap;
import java.util.Map;

public class _4_DuplicateCharatersInStringByMap {

	public static void main(String[] args) {
	
		String str = "sillyspiders";
		int stringLength = str.length();
		char[] ch = str.toCharArray();
		LinkedHashMap<Character, Integer> hmap = new LinkedHashMap<>();
		int i = 0;
		while(i != stringLength)
		{
			if(hmap.containsKey(ch[i]) == false)
			{
				hmap.put(ch[i], 1);
			}
			else {
				int oldValue = hmap.get(ch[i]);
				int newValue = oldValue + 1;
				hmap.put(ch[i], newValue);
			}
			i++;
		}
		
		System.out.println("The duplicate characters in the String : " + str);
		for(Map.Entry<Character, Integer> m : hmap.entrySet())
		{
			if (m.getValue() > 1) {
				System.out.print(m.getKey() + " ");
			}
		}
		
	}

}
