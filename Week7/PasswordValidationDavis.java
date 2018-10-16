import java.util.Scanner;

public class PasswordValidationDavis {

	public static void main(String[] args) {
		//	Spencer Davis
		
		Scanner in = new Scanner(System.in);
		
		final String successMsg = "Password Chaged.";
		String passwordInput = "";
		String passwordConfirm = "";
		
		do {
			//	Prompt
			System.out.println("Enter a password:");
			passwordInput = in.nextLine();
			
			System.out.println("Confirm password:");
			passwordConfirm = in.nextLine();
			
			
		} while (!validatePassword(passwordInput, passwordConfirm));
		
		System.out.println(successMsg);
		in.close();
	}
	
	public static boolean validatePassword(String passOne, String passTwo) {
		
		boolean hasUpper = false;
		boolean hasLower = false;
		boolean hasDigit = false;
		
		if (passOne.equals(passTwo)) {	//	Are equal
			
			if(passOne.length() >= 8) {	//	Has atleast 8
				
				for (int i = 0; i < passOne.length(); i++) {
					char sub = passOne.charAt(i);
					
					if (Character.isUpperCase(sub)) {		//	Has an upper
						hasUpper = true;
					} else if(Character.isLowerCase(sub)) {	//	Has a lower
						hasLower = true;
					} else if (Character.isDigit(sub)) {	//	Has a digit
						hasDigit = true;
					}
				}
			} else {
				return false;
			}
		} else {	//	Passwords not equal
			return false;
		}
		
		if (hasUpper && hasLower && hasDigit) {	//	Has upper / lower / digit
			return true;
		}
		else {
			return false;
		}
		
	}
}
