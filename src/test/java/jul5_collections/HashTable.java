package jul5_collections;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		
		ht.put(1, "one");
		ht.put(2, "two");
		ht.put(3, "");
		ht.put(4, "a");
		ht.put(5, "a");
		
		ht.put(5, "abcd");
		
		//ht.put(null, "hello");
		
		//ht.put(3, null); // it will throw an error because it cannot store the null value
		ht.put(null, ""); // it will throw an error because it cannot store the null key
		System.out.println(ht);
	}

}
