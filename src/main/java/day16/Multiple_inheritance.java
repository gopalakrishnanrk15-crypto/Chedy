package day16;

public class Multiple_inheritance implements HDFC,SBI  {

	@Override
	public void depoit() 
	{
		System.out.println("vinoth");
		
	}

	@Override
	public void name() {
		System.out.println("vasanth");
	}

	@Override
	public void credit() {
		System.out.println("gopi");
		
	}

	@Override
	public void deposit() {
		
		
	}

	@Override
	public void fixed() {
		System.out.println("gopi");
	}

	@Override
	public void flag() 
	{
		
		
	}

	public static void main(String[] args) {
		
		Multiple_inheritance mi = new Multiple_inheritance();
		mi.credit();
		mi.depoit();
		mi.fixed();
	}
	
	
	
	

}
