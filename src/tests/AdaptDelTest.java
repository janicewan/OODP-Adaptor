package tests;

import static org.junit.Assert.*;

import oldCode.NosrepInt;
import oldCode.Person;

import org.junit.Test;

public class AdaptDelTest {

	@Test
	public void test() {
		String expectedAnswer= "A person";
		String actualAnswer;
		
		NosrepInt classUnderTest= new AdaptDel(new Person());
				
		actualAnswer= classUnderTest.youWho();
				
		assertEquals("Wrong Answer!", expectedAnswer, actualAnswer);
	}

}
