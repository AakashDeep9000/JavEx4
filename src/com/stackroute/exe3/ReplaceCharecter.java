package com.stackroute.exe3;

public class ReplaceCharecter {
	public static String replacing(String str)
	{
		String replaced = new String();
		replaced = str.replaceAll("d","f").replaceAll("l","t");
		return replaced;
	}
}
