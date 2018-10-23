import java.util.Arrays;

public class RandomTenDavis {

	public static void main(String[] args) {
		//	Spencer Davis
		
		int[] ArrayDavis = new int[10];
		int rndCeiling = 21;
		int rndFloor = 1;
		String EvenIndex = "";
		String EvenElement = "";
		int highestElement = 0;
		int lowestElement = 0;
		
		
		
		//	Set up array with random values between 1 and 20
		for (int i = 0; i < ArrayDavis.length; i++) {
			
			//	Makes random number and sets array element to that value
			int rnd = rndFloor + (int)(Math.random() * rndCeiling);
			ArrayDavis[i] = rnd;
			
			//	Sets the first value of the array to the lowest number
			if (i == 0) {
				lowestElement = ArrayDavis[i];
			}
			
			//	Highest / Lowest Element
			if (ArrayDavis[i] > highestElement) {
				highestElement = ArrayDavis[i];
			} else if (ArrayDavis[i] < lowestElement) {
				lowestElement = ArrayDavis[i];
			}
			
			//	Even index elements
			if (i % 2 == 0) {
				EvenIndex += rnd + " ";
			}
			
			//	Even elements
			if (rnd % 2 == 0) {
				EvenElement += rnd + " ";
			}
		}
		
		//	Reverse the array
		int[] ReverseArray = ArrayDavis;
		
		for(int i = 0; i < ReverseArray.length / 2; i++)
		{
		    int temp = ReverseArray[i];
		    ReverseArray[i] = ReverseArray[ReverseArray.length - i - 1];
		    ReverseArray[ReverseArray.length - i - 1] = temp;
		}
		
		//	First and last element
		int firstElement = ArrayDavis[0];
		int arrayLength = ArrayDavis.length;
		int lastElement = ArrayDavis[(arrayLength - 1)];
		
		//	Formats output to not have brackets
		String everyElementStringed = Arrays.toString(ArrayDavis);
		everyElementStringed = everyElementStringed.substring(1, everyElementStringed.length()-1);
		String reverseArrayStringed = Arrays.toString(ReverseArray);
		reverseArrayStringed = reverseArrayStringed.substring(1, reverseArrayStringed.length()-1);
		
		//	Print messages
		System.out.println("Every element in the array: " + everyElementStringed);
		System.out.println("Every element at an even index: " + EvenIndex);
		System.out.println("Even elements: " + EvenElement);
		System.out.println("All elements in reverse order: " + reverseArrayStringed);
		System.out.println("First element: " + firstElement);
		System.out.println("Last element: " + lastElement);
		System.out.println("Highest element: " + highestElement);
		System.out.println("Lowest element: " + lowestElement);
	}

}
