package day9;

public class Sbi_Bank extends Method_overriding{

	// child class
	
	
    public void deposit()
	{
		System.out.println("deposit amount is 60");
	}
	
    public void range()
	{
		System.out.println("power ranger");
	}
    
    public void salary()
	{
		System.out.println("15000");
	}

    
    
    public static void main(String[] args) {
		
    	Sbi_Bank sb = new Sbi_Bank();
    	
    	sb.deposit();
    	sb.range();
   
    	sb.salary();
    	
	}
    
    
}
