package day13;

import java.lang.reflect.Array;
import java.util.InputMismatchException;

public class Array_Demo {
	
	
	
	public static void main(String[] args) {
		
		//declaration
		
		// adding value
		
		//Readimg the value
		
		//Aproach 1
		int a[] = new int [5];
		
		a[0] =10;
		a[1] = 20;
		a[2]= 30;
		a[3]= 40;
		a[4]= 50;
		
		try {
			
		for (int i=0 ;i<=7; i++)
		{
			System.out.println(a[i]);
		}
		}
		catch (Exception e) 
		{
			System.out.println(e.getClass());
			
		}
		
		

		for (int b : a)
		{
			System.out.println(b);
		}
		
		System.out.println("hai vasanth");
		System.out.println("hai vinoth");
		
		
	}
		
	}


