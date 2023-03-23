package telran.string.test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void testCharAt() {
		
		assertTrue("ann".charAt(0) == 'a');
		assertFalse("telran".charAt(3) == 'l');
	}
	
	@Test
	void testCompareTo() {
		assertTrue("Israel".compareTo("Israel") == 0);
		assertTrue("Russia".compareTo("ss") < 0);
	}
	
	@Test
	void testCompareToIgnoreCase(){
		assertTrue("Israel".compareToIgnoreCase("israel") == 0);
		assertFalse("CamelCase".compareToIgnoreCase("camel") == 0);
	}
	
	@Test
	void testConcat(){
		assertEquals("CamelCase",  "Camel".concat("Case"));
		assertNotEquals("CamelCase",  "Camel".concat("-Case"));
	}
	
	@Test
	void testStartsWith(){
		assertTrue("Israel".startsWith("I"));
		assertFalse("Israel".startsWith("i"));
	}
	
	@Test
	void testEndsWith(){
		assertTrue("telraN".endsWith("raN"));
		assertFalse("telRan".endsWith("N"));
		
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
