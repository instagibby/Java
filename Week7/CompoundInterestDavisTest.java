import static org.junit.Assert.*;

import org.junit.Test;

public class CompoundInterestDavisTest {

	@Test
	public void test() {
		assertEquals(1141.17, CompoundInterestDavis.computeBalance(1000, .045, 3), 0.01);
		assertEquals(2318.55, CompoundInterestDavis.computeBalance(2000, .03, 5), 0.01);
		assertEquals(3313.87, CompoundInterestDavis.computeBalance(3000, .01, 10), 0.01);
	}

}
