package day20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ArrayListDemo {
	
	public static void main(String[] args) {
	
		//Declaration
		
		//ArrayList li = new ArrayList();
		//List li = new ArrayList();
		//ArrayList<String> li = new ArrayList<String>();
		
		ArrayList li = new ArrayList();
		
		//adding the value or data
		
		
		li.add(1000);
		li.add(10.5);
		li.add("hai");
		li.add(true);
		li.add(1000);
		li.add(null);
		li.add(null);
		li.add("gopi");
		
		
		
	//	size of arraylist
		//int size = li.size();
		//System.out.println(size);
		
		//printing the arraylist
		//System.out.println("printing the arraylist:"+li);
		
		//Remove data from arraylist
		//Object remove = li.remove(2);
		//System.out.println(remove);
		
		//Insert the data 
		//li.add(2, "java");
		//System.out.println(li);
		
		//modify the data in arraylist (replace /change )
		//li.set(2, "selenium");
		//System.out.println(li);
		
		//specifice value from arraylist
		//Object gt = li.get(7);
		//System.out.println(gt);
		
		//Reading all the datas from arraylist
		/*
		for (int i=0; i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		*/
		
		//Enhanced for loop
		/*for (Object x:li)
		{
			System.out.println(x);
		}
		*/
		
		//iterator
		
	/*	Iterator it = li.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	*/
		
		//checking the arrylist is empty or not
		//boolean empty = li.isEmpty();
		//System.out.println(empty);
		
		//Remove all data 
		
		//li.clear();
		//System.out.println(li.isEmpty());
	
		
		/*Multiple data removing from arraylist
		
		ArrayList li1 = new ArrayList();
		
		li1.add(1000);
		li1.add(true);
		li1.add("gopi");
		
		li.removeAll(li1);
		System.out.println("Removing Multiple elements in arraylist:"+li);
		*/
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
;