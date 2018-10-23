
public class CourseNumberCheckDavis {

	public static void main(String[] args) {
		// Spencer Davis
		boolean valid = isCourseNumberValid("CIS171");

	}

	public static boolean isCourseNumberValid(String courseNo) {
		boolean hasThreeLetter = true;
		boolean hasThreeNumber = true;
		int courseLength = courseNo.length();

		if (courseLength > 6 || courseLength < 6) {
			return false;
		} else {

			// Loops through string
			for (int i = 0; i < courseLength; i++) {
				char sub = courseNo.charAt(i);
				if (i == 0 || i == 1 || i == 2) {
					// Tests if char is NOT upper case
					if (!Character.isUpperCase(sub)) { // Has an upper
						hasThreeLetter = false;
					}
				} else if (i == 3 || i == 4 || i == 5) {
					// Tests if char is NOT digit
					if (!Character.isDigit(sub)) {
						hasThreeNumber = false;
					}
				}
			}
		}

		if (hasThreeLetter && hasThreeNumber) {
			return true;
		} else {
			return false;
		}

	}

}
