import static org.junit.Assert.*;

import org.junit.Test;

public class PasswordValidationDavisTest {

	@Test
	public void test() {
		//	Works
		assertTrue(PasswordValidationDavis.validatePassword("Rawr1234", "Rawr1234"));
		
		//	Fails
		//	No Upper
		assertFalse(PasswordValidationDavis.validatePassword("rawr1234", "rawr1234"));
		//	No lower
		assertFalse(PasswordValidationDavis.validatePassword("RAWR1234", "RAWR1234"));
		//	No number
		assertFalse(PasswordValidationDavis.validatePassword("rawrRawr", "rawrRawr"));
		//	Doesn't match
		assertFalse(PasswordValidationDavis.validatePassword("rawr1234", "rawr1234"));
		//	No entry
		assertFalse(PasswordValidationDavis.validatePassword("", ""));
		//	One entry
		assertFalse(PasswordValidationDavis.validatePassword("Rawr1234", ""));
		assertFalse(PasswordValidationDavis.validatePassword("", "Rawr1234"));
		
		
	}

}
