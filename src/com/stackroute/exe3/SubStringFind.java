package com.stackroute.exe3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubStringFind {
	public static String subFinding(String str,String sub)
	{
		Pattern pattern = Pattern.compile(sub);
		Matcher matcher = pattern.matcher(str);
		String index = "";
		while(matcher.find())
		{
			index+=matcher.start()+"-"+matcher.end()+" ";
		}
		return index.trim();
	}
}
