package src;

import static org.junit.Assert.*;

import org.junit.Test;

public class InstructorTest {

	//Spencer Davis
	
	@Test
	public void testMakeEmailAddress() {
		Instructor test = new Instructor();
		assertEquals("kcat@dmacc.edu", test.makeEmailAddress("kit", "cat"));
		assertEquals("kcat@dmacc.edu", test.makeEmailAddress("KIT", "CAT"));
	}

}
