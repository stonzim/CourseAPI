package main.course;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CourseTest {
	Course course = new Course(1, "one", "one", 1);
	
	@Test
	void test() {
		int expected = 1;
		int actual = course.getId();
		assertEquals(expected, actual, "Numbers should be the same");	
		}
}
