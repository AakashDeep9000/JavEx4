package com.stackroute.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.stackroute.exe3.LongestSubString;

class LongestSubStringTest {

	@Test
	void testLongestSubFind() {
		String str = "aaabbcbbbcbbaaabb";
		String expec = "bbcbbbcbb";
		assertEquals(expec,LongestSubString.longestSubFind(str));
	}

}
