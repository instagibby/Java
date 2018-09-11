import java.util.Scanner;

public class MadLibsDavis {
	
	//Spencer Davis
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a name: ");
		String aName = in.nextLine().toLowerCase();

		String capFirstAName = aName.substring(0, 1).toUpperCase() + aName.substring(1);
		
		System.out.println("Enter an object: ");
		String objectI = in.nextLine().toLowerCase();
		
		System.out.println("Enter another object: ");
		String objectII = in.nextLine().toLowerCase();
		
		System.out.println("Enter a final object: ");
		String objectIII = in.nextLine().toLowerCase();
		
		System.out.println("Enter a past tense verb: ");
		String pastTense = in.nextLine().toLowerCase();
		
		System.out.println("Enter an adjective: ");
		String anAdjective = in.nextLine().toLowerCase();
		
		System.out.println("Once upon a time there was a person named " + capFirstAName + ". " + capFirstAName + " had giant " + objectI + ".\n"
				+ "This was problematic because it wouldn't fit in " + capFirstAName + "'s " + 
				objectII + ".\nThough it turned out okay in the end because they got a " + anAdjective +" " + objectIII + " to " + pastTense + " with!" );

		
		
		in.close();

	}

}
