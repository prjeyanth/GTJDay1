package org.array;

public class Array {
	
	public static void main(String[] args) {
		
		
	System.out.println("----single dimentional array----");	
	
		int a[]=new int[4];
		a[0]=10;
		a[1]=11;
		a[2]=12;
		a[3]=13;
		
		
		a[1]=15;//replace
		System.out.println(a);//memory allocation
		System.out.println(a[0]);
		
		//size
		
		int length = a.length;
		System.out.println(length);
		
		System.out.println("----for loop-----");
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
		System.out.println("----enhanced for loop----");

		for(int x:a) {
			System.out.println(x);
		}
		
		int b[]= {10,11,12};
		
		System.out.println(b.length);
		System.out.println(b[1]);
		
		
		System.out.println("----multidimentional array----");
		
		int [][]c=new int[2][3];
		c[0][0]=10;
		c[0][1]=11;
		c[0][2]=12;
		c[1][0]=20;
		c[1][1]=21;
		c[1][2]=22;
		
		
		System.out.println(c);
		System.out.println(c[0][2]);
		
		System.out.println(c.length);//row size
		System.out.println(c[0].length);//column size
		
		System.out.println("----nested for loop----");
		
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c[0].length;j++) {
				System.out.print(c[i][j]+" ");
				
			}
			
			System.out.println();
		}
		
		
		int d[][]= { {10,11,12},
				     {20,21,22} };
		
		System.out.println(d[1][0]);
		System.out.println(d[0].length);//coumn length
		System.out.println(d.length);//row length
		
		
		
	}
	
	

}
