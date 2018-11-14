import java.time.LocalDate;

public class BillfoldTesterDavis {

	public static void main(String[] args) {
		// Spencer Davis

		DriverLicense dl = new DriverLicense("Spencer", "041941", LocalDate.of(2020, 5, 12));
		YMCACard ymca = new YMCACard("Spencer", "10AB31541");
		DriverLicense dl2 = new DriverLicense("Claire", "4141411", LocalDate.of(2015, 10, 10));
		DebitCard dc = new DebitCard("Claire", "1141 5124 1231 4413", 0000);

		// Dupilcate Test
		YMCACard test1 = new YMCACard("Kelli", "1QAZXSW");
		YMCACard test2 = new YMCACard("Kelli", "1QAZXSW");

		Billfold spencerWallet = new Billfold();
		Billfold claireWallet = new Billfold();

		spencerWallet.addCard(dl);
		spencerWallet.addCard(ymca);
		claireWallet.addCard(dl2);
		claireWallet.addCard(dc);

		System.out.println(spencerWallet.formatCards());
		System.out.println(claireWallet.getExpiredCardCount());
		System.out.println(test1.equals(test2));
	}

}
