
public class EqualArrayCheck {

	public static void main(String[] args) {
		//	Spencer Davis
		
		int[] array1 = {1,2,3,4,5};
		int[] array2 = {1,2,3,4};
		int[] array3 = {1,2,3,4,5};
		int[] array4 = {2,4,5,1,3};
		
		System.out.println(areArraysEqual(array1, array2));
		System.out.println(areArraysEqual(array1, array3));
		System.out.println(areArraysEqual(array1, array4));

	}
	public static boolean areArraysEqual(int[] firstArray, int[]secondArray) {
		
		if (firstArray.length != secondArray.length) {
			return false;
		} else {
			for (int i = 1; i < firstArray.length; i++) {
				if(firstArray[i] != secondArray[i]) {
					return false;
				}
			}
			return true;
		}
	}

}
