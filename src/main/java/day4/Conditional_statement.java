package day4;

public class Conditional_statement {
	
	public static void main(String[] args) {
//1.Conditional/Selection statements (if, ifelse, elseif, nested,laderif,switchCase )
		
		//if
		
		/*
		 * int person_age =18;
		 * 
		 * if(person_age>=18) { System.out.println("He is eligible for vote"); } else {
		 * System.out.println("Not eligible for vote"); }
		 */

		
		//  interviw question =================== int num = 10;
		 
		 if(num%2==0) { System.out.println("It even number"); 
		 } 
		 else 
		 {
		  System.out.println("It odd number"); 
		 }
		 

		// interviw question ( Number is positive or negative number )

		/*
		 * int a = 0;
		 * 
		 * if (a>0) { System.out.println("Postive number"); } else if(a<0) {
		 * System.out.println("Negative number"); } else if(a ==0) {
		 * System.out.println(" is Zero"); }
		 */

		// nested if
		/*
		 * if(false) { System.out.println("xyz");
		 * 
		 * if(false) { System.out.println("123"); }
		 * 
		 * else if (false) { System.out.println("abc"); }
		 */

		/*
		 * laderif
		 * 
		 * 
		 * int day = 6;
		 * 
		 * if (day==1) { System.out.println("It's sunday"); } else if (day == 2) {
		 * System.out.println("It's satday "); } else if (day == 3) {
		 * System.out.println("It's monday "); } else if (day == 4) {
		 * System.out.println("It's tuesday "); } else if (day == 5) {
		 * System.out.println("It's wednesday "); } else if (day == 6) {
		 * System.out.println("It's thuresday "); } else if (day == 7) {
		 * System.out.println("It's friday "); } else if (day == 8) {
		 * System.out.println("Not matched"); }
		 */

		/* switchCase

		int weeknum = 8;
		
		switch (weeknum) {
		case 1:System.out.println("It's sunday ");break;
		case 2:System.out.println("It's satday ");break;
		case 3:System.out.println("It's monday ");break;
		case 4:System.out.println("It's tuesday ");break;
		case 5:System.out.println("It's wednesday ");break;
		case 6:System.out.println("It's thuesday ");break;
		case 8:System.out.println("It's friday ");break;
		
		}

			
		}
	}

