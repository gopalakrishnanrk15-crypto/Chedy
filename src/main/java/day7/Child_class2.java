package day7;

public class Child_class2 extends Parent_class {

// child 2
	public void diwali() {
		System.out.println("gift");
	}

	public void Pongal() {
		System.out.println("jallikathu");
	}

	public static void main(String[] args) {
		
		Child_class2 c1 = new Child_class2();
		
		c1.diwali();
		c1.Pongal();
		c1.coursedetails();
		c1.studentn();
		
		
	}
	
}
