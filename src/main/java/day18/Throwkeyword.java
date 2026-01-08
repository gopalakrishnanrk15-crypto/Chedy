package day18;

public class Throwkeyword {
	
	private void checksum(int num) 
	{
		if(num>1)
		{
			throw new ArithmeticException("Number is negative");
		}
		else
		{
			System.out.println(num*num);
		}

	}
	
	public static void main(String[] args) {
		
		Throwkeyword tk = new Throwkeyword();
		try {
		tk.checksum(5);
		}
		catch (Exception e) 
		{
			System.out.println(e.getClass());
			System.out.println("Exception Handled");
		}
	}
	

}
