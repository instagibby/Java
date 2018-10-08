import java.util.Scanner;

public class VowelFoundDavis {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		// Declare Variables
		boolean hasVowel = false;
		boolean wishToContinue = true;
		String userInputWord = "";
		String msgToUser = "Please enter a word with a vowel.";
		// constants
		final String vowelFound = "A vowel has been found! ";
		final String enterAnotherVowel = "Enter another vowel or \"exit\" to exit";
		final String userInputPrompt = "Enter enter a word:";
		final String nonString = "Please enter a word next time.";
		final String exitKey = "exit";
		final String vowelA = "a";
		final String vowelE = "e";
		final String vowelI = "i";
		final String vowelO = "o";
		final String vowelU = "u";
		final String vowelY = "y";

		do {
			// Prompts
			System.out.println(userInputPrompt);
			userInputWord = in.nextLine().toLowerCase();

			if (userInputWord.matches("[a-zA-Z]+") && !userInputWord.equals(exitKey)) {

				for (int i = 0; i < userInputWord.length(); i++) {
					String sub = userInputWord.substring(i, i + 1);

					switch (sub) {
					case vowelA:
						hasVowel = true;
						break;
					case vowelE:
						hasVowel = true;
						break;
					case vowelI:
						hasVowel = true;
						break;
					case vowelO:
						hasVowel = true;
						break;
					case vowelU:
						hasVowel = true;
						break;
					case vowelY:
						hasVowel = true;
						break;
					}
					if (hasVowel) {
						msgToUser = vowelFound + enterAnotherVowel;
						break;
					}
				}

			} else if (userInputWord.equals(exitKey)) {
				wishToContinue = false;
				break;
			} else {
				// If non-string handles it
				msgToUser = nonString;
			}
			System.out.println(msgToUser);
		} while (wishToContinue);

	}

}
