import static org.junit.Assert.*;

import org.junit.Test;

public class CourseNumberCheckDavisTest {

	@Test
	public void test() {
		
		assertTrue(CourseNumberCheckDavis.isCourseNumberValid("CIS171"));
		assertTrue(CourseNumberCheckDavis.isCourseNumberValid("NET332"));
		
		assertFalse(CourseNumberCheckDavis.isCourseNumberValid("CISS171"));
		assertFalse(CourseNumberCheckDavis.isCourseNumberValid("CIS1711"));
		assertFalse(CourseNumberCheckDavis.isCourseNumberValid("CIS 171"));
		assertFalse(CourseNumberCheckDavis.isCourseNumberValid("cIS171"));
		assertFalse(CourseNumberCheckDavis.isCourseNumberValid("cis171"));
		assertFalse(CourseNumberCheckDavis.isCourseNumberValid("171CIS"));
		assertFalse(CourseNumberCheckDavis.isCourseNumberValid("cis"));
		assertFalse(CourseNumberCheckDavis.isCourseNumberValid("171"));
		assertFalse(CourseNumberCheckDavis.isCourseNumberValid(""));
		assertFalse(CourseNumberCheckDavis.isCourseNumberValid("C!S171"));
		assertFalse(CourseNumberCheckDavis.isCourseNumberValid("C171S"));
		assertFalse(CourseNumberCheckDavis.isCourseNumberValid("CI171"));

	}

}
