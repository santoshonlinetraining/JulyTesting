package jul5_collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionsHashMap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		
		hs.put(3, "Gaddam");
		hs.put(10, "Santosh");
		hs.put(2, "kumar");
		
		System.out.println(hs);
		
		hs.remove(2); // removing the key 2
		System.out.println(hs);
		
		hs.put(null, "its me null keys");
		
		
		hs.put(null, "its me null key");
		System.out.println(hs);
		
		//printing hashset
		Set hp = hs.entrySet();
		Iterator ip = hp.iterator();
		
		while(ip.hasNext()) {
			Map.Entry mp = (Map.Entry)ip.next();
			
			System.out.println(mp.getValue());
			
		}

	}
}