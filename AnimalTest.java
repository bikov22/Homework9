package fmi.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnimalTest {

	@Test
	public void Animaltest() {
		List<String> animals = Stream.of("cat", "dog", "cow", "bird")
	      .map(String::toUpperCase)
	      .collect(Collectors.toList());

		Assert.assertEquals(animals.get(0),"CAT");
		Assert.assertEquals(animals.get(1),"DOG");
		Assert.assertEquals(animals.get(2),"COW");
		Assert.assertEquals(animals.get(3),"BIRD");
	}
}
