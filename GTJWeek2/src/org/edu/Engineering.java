package org.edu;

public class Engineering extends Medicine{

	public void bE() {
		System.out.println("Bachelor of Engineering");
	}
	public void bTech() {
		System.out.println("Bachelor of Tefchnology");
	}
	
	public static void main(String[] args) {
		Engineering eng = new Engineering();
		eng.bE();
		eng.bTech();
		eng.dental();
		eng.physiyo();
		eng.mbbs();
	}
}
