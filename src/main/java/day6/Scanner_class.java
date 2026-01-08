package day6;

import java.util.Scanner;

public class Scanner_class {

	public static void main(String[] args) {

		Scanner sa = new Scanner(System.in);

		
		System.out.println("Entetr Your Number ");
		long nextLong = sa.nextLong();
		
		System.out.println("exception handled");
		System.out.println("Entetr Your Deposit Amount ");
		int nextInt = sa.nextInt();

		Scanner ss = new Scanner(System.in);
		
		System.out.println("Entetr Your salary Amount ");
		short nextShort = sa.nextShort();

		System.out.println("Entetr Your average  salary ");
		double nextDouble = sa.nextDouble();

		System.out.println("Are Your Human are Not");
		boolean nextBoolean = sa.nextBoolean();

/*
		System.out.println("***********************************");

		System.out.println("Entetr Your Number " + nextLong);
		System.out.println("Entetr Your Deposit Amount " + nextInt);
		System.out.println("Entetr Your salary Amount " + nextShort);
		System.out.println("Entetr Your average  salary" + nextDouble);
		System.out.println("Entetr Your Human" + nextBoolean);

      
	/*	
	System.out.println("Enter your office");
	String name = sa.next();
	System.out.println("My name is:"+name);
	
	System.out.println("Enter your officenamae");
	double nextDouble = sa.nextDouble();
	System.out.println("My name is:"+nextDouble);
		
		*/
		
	}
}