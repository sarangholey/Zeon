package Javasessions;

import java.io.ObjectInputStream.GetField;
import java.util.Hashtable;
import java.util.Map;

public class _HashTable {
	public static void main(String[] args) {
		Hashtable<String, String> prodTable = new Hashtable<String,String>();
		prodTable.put("Apple Macbook", "2000");
		prodTable.put("Windows Laptop", "1500");
		prodTable.put("Asus Tablet", "999");
		System.out.println(prodTable.get("Asus Tablet"));// O/P - 999
		System.out.println(prodTable);// O/P - {Asus Tablet=999, Windows Laptop=1500, Apple Macbook=2000}
		// itrating the HashTable
		for(Map.Entry m : prodTable.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		// O/P 	Asus Tablet 999
		//		Windows Laptop 1500
		//		Apple Macbook 2000
	}
}
