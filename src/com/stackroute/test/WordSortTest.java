package com.stackroute.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.stackroute.exe3.WordSort;

class WordSortTest {

	@Test
	void testWordSorting() {
		String str = "this is all very good";
		assertEquals("all",WordSort.wordSorting(str)[0]);
		assertEquals("good",WordSort.wordSorting(str)[1]);
		assertEquals("is",WordSort.wordSorting(str)[2]);
		assertEquals("this",WordSort.wordSorting(str)[3]);
		assertEquals("very",WordSort.wordSorting(str)[4]);
	}

}
