/**
 * 
 */
package tests;


import static org.junit.Assert.*;

import org.junit.Test;

import oldCode.Nosrep;
import oldCode.NosrepInt;


/**
 * @author jwan01
 *
 */
public class NosrepTest {

	@Test
	public void test() {
		String expectedAnswer= "NesropA";
				String actualAnswer;
				NosrepInt classUnderTest= new Nosrep();
				actualAnswer= classUnderTest.youWho();
				assertEquals("Wrong Answer!", expectedAnswer, actualAnswer);
	}

}
