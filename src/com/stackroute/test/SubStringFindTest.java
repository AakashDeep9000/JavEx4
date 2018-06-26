package com.stackroute.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.stackroute.exe3.SubStringFind;

class SubStringFindTest {

	@Test
	void testSubFinding() {
		String str = "She sells seashells by the seashore";
		assertEquals("4-6 10-12 27-29",SubStringFind.subFinding(str, "se"));
	}

}
