package jul5_collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample{  
	 public static void main(String args[]){  
	  ArrayList<String> list = new ArrayList<String>(); //Creating arraylist
	  
	      list.add("Santosh");//Adding object in arraylist    
	      list.add("Naveen");    
	      list.add("Shiva");    
	      list.add("Pavan");    
	      //Printing the arraylist object   
	      System.out.println(list);  
	      
	      //to iterate or print use below code
	      Iterator itr = list.iterator();//getting the Iterator  
	      while(itr.hasNext()){//check if iterator has the elements  
	       System.out.println(itr.next());//printing the element and move to next  
	      }  
	      
	      
	      //print using for each
	      for(String name:list)    {
	    	    System.out.println(name);    
	      }
	      
	      //print using forloop
	      for(int i=0;i<list.size();i++){
	    		System.out.println(list.get(i));
	      }

	      // add with index
	      list.add(1, "Vinod");
	      System.out.println("after replacing the value");
	      //print using forloop
	      for(int i=0;i<list.size();i++){
	    		System.out.println(list.get(i));
	      }
	      

	      // remove with index
	      list.remove(2);
	      System.out.println("after remove the value");
	    //print using forloop
	      for(int i=0;i<list.size();i++){
	    		System.out.println(list.get(i));
	      }
	      
	      
	 }  
}  