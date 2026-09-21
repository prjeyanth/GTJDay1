package org.lang;

public class StateDetails {

	// Request : southIndia(),northIndia()
	// Logic : Create a method based on the Request and print the value

	// Method 1:
	public void southIndia() {
		System.out.println("TN, TS, AP, KL, KA");
	}

	// Method 2:
	public void northIndia() {
		System.out.println("MH, UP, MP, RJ, UK, HP");
	}

	public static void main(String[] args) {

		// Object Name creation and Initializing
		StateDetails sd = new StateDetails();
		// Calling first Method southIndia
		sd.southIndia();
		// Calling Second Method northIndia
		sd.northIndia();

		// Another Request : Create an object for LanguageInfo and StateDetails inside
		// the StateDetails class and call both classes methods also follow the all
		// coding standards.

		LanguageInfo langinfo = new LanguageInfo();

		// Calling Method using tamilLanguage Method
		langinfo.tamilLanguage();
		// Calling Method using englishLanguage Method
		langinfo.englishLanguage();
		// Calling Method using hindiLanguage Method
		langinfo.hindiLanguage();
	}
}
