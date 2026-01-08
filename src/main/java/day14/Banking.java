package day14;

public class Banking extends Constructor_Demo {
	
	//child
	
	public Banking(String address)
	{
		super(234.3f);
		System.out.println("Address pondichery");
	}
	
	public Banking()
	{
	  this("name");
		System.out.println("Bank name is HDFC");
	}
	
	
	
	public static void main(String[] args) {
		
		Banking bk = new Banking();
		
		
		
	}
	
}
