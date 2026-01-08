package day12;

public class String_Demo {
	
	public static void main(String[] args) {
		
		//Literal String
		
	/*	String s1="java";
		String s2="java";
		String s3="python";
		
		System.out.println("**********************");
		System.out.println(s1+" "+System.identityHashCode(s1));
		System.out.println(s2+" "+System.identityHashCode(s2));
		System.out.println(s3+" "+System.identityHashCode(s3));

*/
        //Non-literal string
		
		/*String s1 = new String ("java");
		String s2 = new String ("java");
		String s3 = new String ("python");
		
		System.out.println("**********************");
		System.out.println(s1+" "+System.identityHashCode(s1));
		System.out.println(s2+" "+System.identityHashCode(s2));
		System.out.println(s3+" "+System.identityHashCode(s3));*/
		
		
		//Immutable String
		
		/*String s1="java";
		String s2="program";
		
		System.out.println("**********************");
		System.out.println(s1+" "+System.identityHashCode(s1));
		System.out.println(s2+" "+System.identityHashCode(s2));
		
		s1=s1.concat(s2);
		System.out.println(s1+" = "+System.identityHashCode(s1));*/
		
		
		//Mutable string
		
		StringBuffer s1 = new StringBuffer("java");
		StringBuffer s2 = new StringBuffer("selenium");
		
		System.out.println("**********************");
		System.out.println(s1+" "+System.identityHashCode(s1));
		System.out.println(s2+" "+System.identityHashCode(s2));
		
		s1=s1.append(s2);
		System.out.println(s1+" = "+System.identityHashCode(s1));
		
		
		
		
		

		

		
		
		
	}

}
