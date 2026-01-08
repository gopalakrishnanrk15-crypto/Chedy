package day15;

public class VPI extends Vinoth_Banking  {
	
	public static void name() 
	{
		System.out.println("vinoth");
	}

	public void address() 
	{
		System.out.println("chennai");
	}

	@Override
	public void malaikottai() 
	{
		System.out.println("coimbator");
		
	}
	
	
	public static void main(String[] args) {
		
		VPI vp = new VPI();
		vp.malaikottai();
		
		
		
	
	}

}
