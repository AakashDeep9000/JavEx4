package com.stackroute.exe3;

import java.util.Arrays;

public class WordSort {
	public static String[] wordSorting(String str)
	{
		String[] para = str.split(" ");
//		for(int i=0;i<para.length;i++)
//		{
//		  for(int j=i;j<para.length;j++)
//		  {
//			  if(para[i].compareTo(para[j])>0)
//			  {
//				  temp = para[i];
//				  para[i]=para[j];
//				  para[j]=temp;
//			  }
//		  }
		Arrays.sort(para);
		return para;
	}
}
