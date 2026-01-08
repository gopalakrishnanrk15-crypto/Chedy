package day19;

import java.util.ArrayList;

public class Wrapper_classes {
	
	public static void main(String[] args) {
	
	//String s = new String("vasanth");
		
	//Integer ii = new Integer(10); -- old version
		
	//Integer i = Integer.valueOf(10); //--new version
	//System.out.println(i);
		
	//Float f = Float.valueOf(20.2f);
    //System.out.println(f);
		
		
	//dataconversionmethods
		
		//string to int
		
		//String s = "8329017";
		//System.out.println(Integer.parseInt(s));
		
		/*Example -1
		String iphone1 = "50000";
		String iphone2 = "50000";
		
		System.out.println(Integer.parseInt(iphone1)+Integer.parseInt(iphone2));
		*/
		
		/*string to double
		String s1 = "10.5";
		String s2 = "20.0";
		
		System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
		
		*/
		
		/*String s= "123";
		int i = Integer.parseInt(s);
		System.out.println(i);	*/
		
		//String s = "welcome"; // string to char not possible
		//char c ='w';
		
		
	//	String s = "true";  --- other than true if you pass any value it will return false
	//	System.out.println(Boolean.parseBoolean(s));
		

	//	Scenario 2--- int, double, boolean, char--->String
		
		int a =10;
		double d = 10.5;
		char c ='A';
		boolean bool = false;
		
		String s = String.valueOf(a);
		System.out.println(s);
		
		String valueOfd = String.valueOf(d);
		System.out.println(valueOfd);
		
		String valueOfc = String.valueOf(c);
		System.out.println(valueOfc);
		
		String valueOfbool = String.valueOf(bool);
		System.out.println(valueOfbool);
		
		
		
		
	
		
		
	
		
		

		
		
		
	
	
	
	

}
}