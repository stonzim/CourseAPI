package main.topic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TopicTest {
	Topic topic = new Topic(1, "one", "one");
	
	@Test
	void test() {
		int expected = 1;
		int actual = topic.getId();
		assertEquals(expected, actual, "Numbers should be the same");
	}
}
