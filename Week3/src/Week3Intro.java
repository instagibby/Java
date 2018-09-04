import java.util.Scanner;

//Spencer Davis

public class Week3Intro {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter you name: ");
		String name = in.nextLine();
		
		System.out.println("Hello " + name + "! Day 2 already!");
		
		
		in.close();
	}	
}
