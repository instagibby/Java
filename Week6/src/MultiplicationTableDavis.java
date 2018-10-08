
public class MultiplicationTableDavis {

	public static void main(String[] args) {
		// Spencer Davis

		final int row = 12, col = 12;

		for (double x = 1; x <= col; x++) {

			for (int n = 1; n <= row; n++) {

				System.out.printf("%10.0f", (x * n));
			}

			System.out.println();
		}
	}
}
