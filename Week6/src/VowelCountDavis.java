import java.util.Scanner;

public class VowelCountDavis {

	public static void main(String[] args) {
		// Spencer Davis

		Scanner in = new Scanner(System.in);

		// Declare Variables
		int vowelCount = 0;
		int yCount = 0;
		boolean hasProperVowel = false;
		String userInputWord = "";
		String msgToUser = " vowel(s) in ";
		// constants
		final int zeroVowels = 0;
		final String userInputPrompt = "Enter enter a word:";
		final String errorMsg = "You must have made a spelling mistake somewhere.";
		final String nonString = "Please enter a word next time.";
		final String vowelA = "a";
		final String vowelE = "e";
		final String vowelI = "i";
		final String vowelO = "o";
		final String vowelU = "u";
		final String vowelY = "y";

		// Prompts
		System.out.println(userInputPrompt);
		userInputWord = in.nextLine().toLowerCase();

		if (userInputWord.matches("[a-zA-Z]+")) {

			for (int i = 0; i < userInputWord.length(); i++) {
				String sub = userInputWord.substring(i, i + 1);

				switch (sub) {
				case vowelA:
					vowelCount++;
					hasProperVowel = true;
					break;
				case vowelE:
					vowelCount++;
					hasProperVowel = true;
					break;
				case vowelI:
					vowelCount++;
					hasProperVowel = true;
					break;
				case vowelO:
					vowelCount++;
					hasProperVowel = true;
					break;
				case vowelU:
					vowelCount++;
					hasProperVowel = true;
					break;
				case vowelY:
					yCount++;
					break;
				}
			}
			// Checks if there were normal vowels
			if (!hasProperVowel) {
				vowelCount = yCount; // If no normal adds y as vowel
				msgToUser = vowelCount + msgToUser + userInputWord;
			} else if (vowelCount == zeroVowels && yCount == zeroVowels) { // Errors out
				msgToUser = errorMsg;
			} else {
				msgToUser = vowelCount + msgToUser + userInputWord; // Successful normal vowel
			}
		} else { // If non-string handles it
			msgToUser = nonString;
		}
		System.out.println(msgToUser);
	}
}
