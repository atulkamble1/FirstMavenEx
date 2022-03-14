package com.lti.demos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestCaseEx {

	@Test
	void test() {
		fail("Not yet implemented");
	}
	@Test
	void testAssertEqual() {
		Assertions.assertEquals("ABC", "ABC");
		Assertions.assertEquals(20, 20, "optional assertion message");
		Assertions.assertEquals(2 + 2, 4);
	}
	@Test
	void testAssertFalse() {
		Assertions.assertFalse("FirstName".length() == 10);
		Assertions.assertFalse(10 > 20, "assertion message");
	}
	@Test
	void testAssertNull() {
	     String str1 = null;
		 String str2 = "abc";
		 Assertions.assertNull(str1);
		 Assertions.assertNotNull(str2);	
	}

}
