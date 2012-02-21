/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import oldCode.Person;

import org.junit.Test;

/**
 * @author jwan01
 *
 */
public class PersonTest {

	@Test
	public void test() {
		String expectedAnswer= "A person";
				String actualAnswer;
				Person classUnderTest= new Person();
				actualAnswer= classUnderTest.whoAreYou();
				assertEquals("Wrong Answer!", expectedAnswer, actualAnswer);
	}

}
