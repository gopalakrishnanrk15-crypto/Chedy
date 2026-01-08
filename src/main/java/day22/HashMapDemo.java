package day22;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		//Declaration	
	//	HashMap hm = new HashMap();	
	//	Map  mymap = new HashMap();
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		//adding the pair
		
		hm.put(101, "gopi");
		hm.put(102, "vinoth");
		hm.put(103, "vasanth");
		hm.put(104, "Bala");
		hm.put(105, "gopi");
		hm.put(104, "tonny");
		
		//System.out.println(hm); //{101=gopi, 102=vinoth, 103=vasanth, 104=tonny, 105=gopi}

	
		//finding the size
		//int size = hm.size();
		//System.out.println(size);
		
		//Removing pair
		//hm.remove(104);
		//System.out.println(hm);// {101=gopi, 102=vinoth, 103=vasanth, 105=gopi}
		
		//access the value
		//String str = hm.get(103);
		//System.out.println(str);
		
		//get all the key from hashmap
		//Set<Integer> keySet = hm.keySet();
		//System.out.println(keySet); //[101, 102, 103, 104, 105]
		
		//Collection<String> values = hm.values();
		//System.out.println(values);  //[gopi, vinoth, vasanth, tonny, gopi]
		
		//Set<Entry<Integer, String>> entrySet = hm.entrySet();
		//System.out.println(entrySet); //[101=gopi, 102=vinoth, 103=vasanth, 104=tonny, 105=gopi]

		
		//Reading the data or elements from hashmap
		
		//using enhanced for loop
		/*
		for (int k : hm.keySet())
		{
			System.out.println(k+"   "+hm.get(k));
		}
		*/
		
		//using iterator
		/*Iterator<Entry<Integer,String>> it = hm.entrySet().iterator();
		while(it.hasNext())
		{
			Entry<Integer,String> entry = it.next();
			System.out.println(entry.getKey()+"   "+entry.getValue());
		}
		*/
		
		//hm.clear();
		//System.out.println(hm.isEmpty());
		//System.out.println(hm);
		

	}

}
