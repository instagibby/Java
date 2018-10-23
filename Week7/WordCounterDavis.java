import java.util.Scanner;

public class WordCounterDavis {

	public static void main(String[] args) {
		//	Spencer Davis
		
		Scanner in = new Scanner(System.in);
		
		//	Prompt
		System.out.println("Enter a phrase to find out how many words are in it:");
		String userPhrase = in.nextLine();
		
		//	Print info to user by running method in sysout
		System.out.println("Your phrase contained " + countWords(userPhrase) + " words!");
		
		
		in.close();
	}

	public static int countWords(String str) {
		
		int count = 1;
		
		if (str.length() > 0) {
			for (int i = 0; i < str.length(); i++) {
				
				String sub = str.substring(i, i+1);
				
				if(sub.equals(" ")) {
					count++;
				}
			}
		} else {
			count = 0;
		}
		
		
		return count;
	}
}
