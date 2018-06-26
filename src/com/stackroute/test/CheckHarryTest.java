package com.stackroute.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.stackroute.exe3.CheckHarry;

class CheckHarryTest {

	@Test
	void testHenryCheck() {
		String str = "This is Harry.";
		assertEquals(true,CheckHarry.harryCheck(str));
		assertEquals(false,CheckHarry.harryCheck("sjcnsdkcj"));
	}

}
