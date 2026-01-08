package day8;

public class Methodoverloading {
	
	public void salary(int age)
	{
		System.out.println("*************************");
		System.out.println("My salary is:"+age);
	}

	public void salary(String name)
	{
		System.out.println("My name is:"+name);
	}

	public void salary(long mobile)
	{
		System.out.println("Mobile Number:"+mobile);
	}
	public void salary(long mobile,int height)
	{
		System.out.println("Mobile Number:"+mobile+height);
		System.out.println("My height is:"+height);
	}
	
	public static void main(String[] args) {
		 
		Methodoverloading m = new Methodoverloading();
		m.salary(10000);
		m.salary("Gopi");
		m.salary(9514111015l);
		m.salary(21);
		m.salary(1234l,12);
				
		
	}
	

}
