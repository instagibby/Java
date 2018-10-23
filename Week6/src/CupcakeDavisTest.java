import static org.junit.Assert.*;

import org.junit.Test;

public class CupcakeDavisTest {

	@Test
	public void test() {
		assertEquals(1.75, CupcakeDavis.CupcakePricing("vanilla", "white"), 0.0);
		assertEquals(2.25, CupcakeDavis.CupcakePricing("chocolate", "red"), 0.0);
		assertEquals(2.75, CupcakeDavis.CupcakePricing("raspberry", "blue"), 0.0);
		assertEquals(3, CupcakeDavis.CupcakePricing("raspberry", "rawr"), 0.0);
		assertEquals(0, CupcakeDavis.CupcakePricing("wat", "OKAY"), 0.0);
	}

}
