import static org.junit.Assert.*;

import org.junit.Test;

public class WordCounterDavisTest {

	@Test
	public void test() {
		assertEquals(5, WordCounterDavis.countWords("Mary had a little lamb"));
		assertEquals(0, WordCounterDavis.countWords(""));
		
	}

}
