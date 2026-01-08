package day7;

public class Child_class extends Parent_class {

	// child class

	public void movie() {
		System.out.println("jailer");
	}

	public void series() {
		System.out.println("game of thrones");
	}
	
	public static void main(String[] args) {
		
		Child_class c = new Child_class();
		
		c.movie();
		c.series();
		c.coursedetails();
		c.movie();
		
	}

}
