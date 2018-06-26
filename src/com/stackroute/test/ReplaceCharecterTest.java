package com.stackroute.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.stackroute.exe3.ReplaceCharecter;

class ReplaceCharecterTest {

	@Test
	void testReplacing() {
		String str = "deidric levels";
		assertEquals("feifric tevets",ReplaceCharecter.replacing(str));
	}

}
