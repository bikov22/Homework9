package fmi.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplyTestTest {

	@Test
	public void testMultiply() {
		JUnittest test = new JUnittest ();
		int result = test.multiply(3,4);
		assertEquals(12,result);
	}
}
