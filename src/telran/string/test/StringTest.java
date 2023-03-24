package telran.string.test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;

class StringTest {

	@Test
	void testCharAt() {
		
		assertTrue("ann".charAt(0) == 'a');
		assertFalse("telran".charAt(3) == 'l');
	}
	
	@Test
	@Disabled
	void testCharAtOutOfBoundTest() {  // do later
		assertEquals('x', "".charAt(0));
		assertEquals('x', "Java".charAt(-1));
		assertEquals('x', "Java".charAt(7));

	}
	
	@Test
	void testCompareTo() {
		assertTrue("Israel".compareTo("Israel") == 0);
		assertTrue("Russia".compareTo("ss") < 0);
		assertFalse("China".compareTo("china")==0);

	}
	
	@Test
	void testCompareToIgnoreCase(){
		assertTrue("Israel".compareToIgnoreCase("israel") == 0);
		assertFalse("CamelCase".compareToIgnoreCase("camel") == 0);
		assertTrue("china".compareToIgnoreCase("china") == 0);

	}
	
	@Test
	void testConcat(){
		assertEquals("CamelCase",  "Camel".concat("Case"));
		assertNotEquals("CamelCase",  "Camel".concat("-Case"));
		assertEquals("".concat("xxxx"), "xxxx".concat(""));
	}
	
	@Test
	void testStartsWith(){
		assertTrue("Israel".startsWith("I"));
		assertFalse("Israel".startsWith("i"));
		assertTrue("XXXXXX".startsWith(""));
	}
	
	@Test
	void testEndsWith(){
		assertTrue("telraN".endsWith("raN"));
		assertFalse("telRan".endsWith("N"));
		assertTrue("XXXXXX".endsWith(""));
	}
	
	@Test
	void testContains(){
		assertTrue("אנה בודשקינה".contains("אנה"));
	}
	
	@Test
	void testIndexOf() {
		assertTrue("барабан".indexOf('б') == 0);
		assertEquals(1, "барабан".indexOf('а'));
		assertFalse("барабан".indexOf('t') == 1);
	}
	
	@Test
	void testLastIndexOf() {
		assertTrue("calculator".lastIndexOf("c") == 3);
		assertFalse("барабан".lastIndexOf('б') == 1);
	}
}
