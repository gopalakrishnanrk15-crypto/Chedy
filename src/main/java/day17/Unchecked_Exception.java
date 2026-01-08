package day17;

public class Unchecked_Exception {
	
	public static void division(int a , int b) 
	{
		System.out.println(a/b);
	}

	public static void main(String[] args) {
		
		division(10, 2); 
		division(9, 2);  
		division(3, 6);  
		division(10, 0); //ArithmeticException
		division(0, 10);
		division(11, 3);
	}
}
