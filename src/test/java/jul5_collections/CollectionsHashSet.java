package jul5_collections;

import java.util.HashSet;
import java.util.Iterator;

public class CollectionsHashSet {
public static void main(String[] args) {
	// TODO Auto-generated method stub
	//example1	
	HashSet<Integer> obj = new HashSet<Integer>();
	obj.add(10);
	obj.add(20);
	obj.add(30);
	obj.add(30);
	
	System.out.println(obj);
	System.out.println(obj.size());
	
	//example2
	HashSet<String> hss = new HashSet<String>();
	hss.add("Santosh");
	hss.add("kumar");
	
	
	hss.add("santosh");
	hss.add("");
	hss.add(null);
	Iterator<String> it = hss.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
}

}
