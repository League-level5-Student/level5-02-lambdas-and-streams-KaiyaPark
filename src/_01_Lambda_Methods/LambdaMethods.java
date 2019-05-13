package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		/*printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		*/
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		/*printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				String ne = "";
				for (int j = s.length()-1; j >= 0; j--) {
					ne+=s.charAt(j);
				}
				System.out.println(ne);
			}
		}, "repeat");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				String ne = "";
				for (int j = 0; j < s.length(); j++) {
					if(j%2 == 0) {
						ne+=s.toUpperCase().charAt(j);
					}
					else {
						ne+=s.charAt(j);
					}
				}
				System.out.println(ne);
			}
		}, "repeat");
		*/
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
	/*	printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				String ne = "";
				for (int j = s.length()-1; j >= 0; j--) {
					ne+=s.charAt(j);
					ne+= '.';
				}
				System.out.println(ne);
			}
		}, "repeat");
	*/
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				String ne = "";
				for (int j = 0; j < s.length(); j++) {
					if ((s.charAt(j) == 'a')||(s.charAt(j) == 'e')) {
					}
					else {
						ne+=s.charAt(j);
					}
				}
				System.out.println(ne);
			}
		}, "repeat");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
