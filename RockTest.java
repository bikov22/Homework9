package fmi.test;

import fmi.informatics.functional.Rock;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

class RockTest {

	@Test
	void rockTest() {
		Rock onEarth = new Rock();
		onEarth.drop(1000);
		//assertEquals(onEarth);
		
	}
}
