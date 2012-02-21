/**
 * 
 */
package tests;

import static org.junit.Assert.*;

import newCode.AdaptInh;

import oldCode.NosrepInt;

/**
 * @author jwan01
 *
 */
public class AdaptInhTest {

	public void test() {
		String expectedAnswer= "A person";
		String actualAnswer;
		
		NosrepInt classUnderTest= new AdaptInh();
				
		actualAnswer= classUnderTest.youWho();
				
		assertEquals("Wrong Answer!", expectedAnswer, actualAnswer);
	}

}
