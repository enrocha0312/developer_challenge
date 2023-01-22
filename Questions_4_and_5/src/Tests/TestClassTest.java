package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Entities.TestClass;

class TestClassTest {

	TestClass testClass = new TestClass("bla bla bla bla", "blablabcde", 10);
	
	@Test
	void testCalculateNumberOfOperations() {
		int testK =  testClass.calculateNumberOfOperations(testClass.getS(), testClass.getT());
		assertEquals(8, testK);
	}

	@Test
	void testWordContainsNumberOrSpecialCharacters() {
		boolean test1 = testClass.wordContainsNumberOrSpecialCharacters("Edu7");
		assertTrue(test1);
		boolean test2 = testClass.wordContainsNumberOrSpecialCharacters("Edu");
		assertFalse(test2);
	}

	@Test
	void testWordContainsUpperCase() {
		boolean test1 = testClass.wordContainsUpperCase("Eduardo");
		assertTrue(test1);
		boolean test2 = testClass.wordContainsUpperCase("oi");
		assertFalse(test2);
	}

	@Test
	void testConcatRemoveSuccessful() {
		String returnTest = testClass.ConcatRemove(testClass.getS(), testClass.getT(), testClass.getK());
		assertEquals("YES", returnTest);
	}
	
	//THe best practice is to test all the fail cases too
	//Example
	@Test
	void testConcatRemoveFailsForK(){
		String returnTest = testClass.ConcatRemove(testClass.getS(), testClass.getT(), 120);
		assertEquals("k can't be greather than 100 or lower than 1", returnTest);
	}
	


}
