package com.stackroute.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.stackroute.exe3.StringTranspose;

class StringTransposeTest {

	@Test
	void testTransposing() {
		String str = "a quick brown fox jumps over the lazy dog";
		assertEquals("[a, kciuq, nworb, xof, spmuj, revo, eht, yzal, god]",StringTranspose.transposing(str));
	}

}
