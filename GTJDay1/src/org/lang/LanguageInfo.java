package org.lang;

public class LanguageInfo {

	// Request : tamilLanguage(),englishLanguage(),hindiLanguage()
	// Logic : Create a method based on the Request and print the value
	
	//Method 1:
	public void tamilLanguage() {
		System.out.println("Tamil");
	}
	//Method 2:
	public void englishLanguage() {
		System.out.println("English");
	}
	//Method 3:
	public void hindiLanguage() {
		System.out.println("Hindi");
	}
	
	public static void main(String[] args) {
		//Object Creation:
		LanguageInfo lang= new LanguageInfo();
		// Calling Method using tamilLanguage Method
		lang.tamilLanguage();
		// Calling Method using englishLanguage Method
		lang.englishLanguage();
		// Calling Method using hindiLanguage Method
		lang.hindiLanguage();
	}
}
