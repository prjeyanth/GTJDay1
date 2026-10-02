package org.conditionstatement;

public class Stdmarks {

	public static void main(String[] args) {
		
		System.out.println("Complie Time");
		// Logic Request:
		
		/*45 Marks Pass
		 45 and under - Fail
		 45 to 55 - D grade
		 55 to 65 - C grade
		 65 to 75 - B grade
		 75 to 85 - A grade
		 85 to 100- A+ grade
		*/
		int m1=97;
		
		if(m1>=45 && m1<=55) {
			System.out.println("D grade");
		}else if(m1>=56 && m1<=65){
			System.out.println("C grade");
		}else if(m1>=66 && m1<=75) {
			System.out.println("B grade");
		}else if(m1>=76 && m1<=85) {
			System.out.println("A grade");
		}else if(m1>=86 && m1<=100) {
			System.out.println("A+ grade");
		}else {
			System.out.println("Fail");
		}

	}

}
