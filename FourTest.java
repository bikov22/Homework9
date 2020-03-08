package fmi.test;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;

public class FourTest {

	@Test
	public void test() {
		List<Integer> nums = new ArrayList<>();
		IntStream.iterate(0, i -> i + 1)
		.skip(5)
		.limit(10)
		.forEach(i -> {
			if (i%2 == 0) nums.add(i);
		});

		assertEquals(6, (int) nums.get(0));
		assertEquals(8, (int) nums.get(1));
		assertEquals(10, (int) nums.get(2));
		assertEquals(12, (int) nums.get(3));
		assertEquals(14, (int) nums.get(4));
	}
}
