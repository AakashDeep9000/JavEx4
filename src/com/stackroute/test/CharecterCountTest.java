package com.stackroute.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.stackroute.exe3.CharecterCount;

class CharecterCountTest {

	@Test
	void testCharecterCounting() {
		String str = "Hello World";
		assertEquals(3,CharecterCount.charecterCounting(str,'l'));
	}

}
