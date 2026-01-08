package day21;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
	
	public static void main(String[] args) {
	
		//Declaration
		
		//Set st = new HashSet();
		//HashSet<String> st = new HashSet<String>();
		
		HashSet hs = new HashSet();
		
		//adding the value
		
		hs.add(100);
		hs.add(10.5);
		hs.add("welcome");
		hs.add(true);
		hs.add('A');
		hs.add(100);
		hs.add(null);
		hs.add(null);
		
		
		System.out.println(hs);
		
		//printing the value
		//System.out.println(hs); //[null, A, 100, 10.5, welcome, true]
		
		//size of the HashSet
		
		//int size = hs.size();
		//System.out.println(size); //6
		
		//Removing the element
		//boolean remove = hs.remove(10.5);
		//System.out.println(remove);
		
		
		
		//Inserting element -- is not possible 
		//accessing the specifice element --- is not possible
		
		//Convert Hashset into Arraylist
		
		/*ArrayList al = new ArrayList(hs);
		System.out.println(al);//[null, A, 100, 10.5, welcome, true]
		Object obj = al.get(0);
		System.out.println(obj);
		*/
		
		//Read all the elements
		
		/*for (Object x :hs)
		{
			System.out.println(x);
		}
		*/
		
		//using Iterator
		
		//Iterator it = hs.iterator();
		/*
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		*/
		
		//clearing the elements in hashset
		
	    //hs.clear();
	     
	    // boolean empty = hs.isEmpty();
	    // System.out.println(empty);
		
		
	}
}
