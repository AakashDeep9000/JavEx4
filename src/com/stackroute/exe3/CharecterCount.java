package com.stackroute.exe3;

public class CharecterCount {
	public static int charecterCounting(String str, char c){
		int count = (int) str.chars().filter(ch->ch==c).count();
		return count;
	}
}
