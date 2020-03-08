package fmi.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConcateTest {

	@Test
	public void testConcatenate() {
		JUnittest test = new JUnittest();
		String result = test.concatenate("one","two");
		assertEquals("onetwo",result);
	}
}

