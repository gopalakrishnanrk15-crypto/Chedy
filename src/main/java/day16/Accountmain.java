package day16;

public class Accountmain {
	
	public static void main(String[] args) {
		
		Account acc = new Account();
		
		acc.setAccno(1234);
		acc.setName("gopi");
		acc.setAmount(1000);
		
		System.out.println(acc.getAccno());
		System.out.println(acc.getName());
		System.out.println(acc.getAmount());
	}

}
