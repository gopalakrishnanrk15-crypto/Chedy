package day13;

public class TwoDimension_Array {
	public static void main(String[] args) {
	
         	//declaration
			// adding value
			//Readimg the value
	
	
			//Aproach 1
		
		/*int a[][]= new int [2][3];
		
		a[0][0]=100;
		a[0][1]=200;
		
		a[0][2]=300;
		a[1][0]=400;
		
		a[1][1]=500;
		a[1][2]=600;
		*/
		
		//Aproach 2
		
		int a[][]= {{100,200},
				    {300,400},
		            {500,600}
				    };
		
		
		//System.out.println(a.length);
		//System.out.println(a[1].length);
		
		//System.out.println(a[0][0]);
		
		for(int i=0; i<=a.length-1;i++)
		{
			for(int j=0; j<=a[i].length-1;j++)
				System.out.println(a[i][j]);
		}
		
	
		/*
		for (int arr[]:a)
		{
			for(int x:arr)
				System.out.println(x);
		}
		*/
		
		
		

	
	
}
}