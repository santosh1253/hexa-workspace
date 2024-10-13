package com.guru.springboot.controller;

public class UserMainCode {
	
public int countSpace(String input1)
{
	String arr[]=input1.split(" ");
	return arr.length;
}
public static int countCommon(String input1, String input2) {
    int count = 0;
    for (int i = 0; i < input1.length(); i++) 
    {
        for (int j = i + 1; j <= input1.length(); j++) 
        {
            String substr = input1.substring(i, j);
            if (input2.contains(substr)) 
            {
                count++;
            }
        }
    }
    return count;
}
  public static void main(String[] args) {
	UserMainCode u=new UserMainCode();
	int res=u.countSpace("Hello, World!");
	System.out.println(res);
	String string1 = "abcdxyz";
    String string2 = "xyzabcd";
    
    int commonSubsCount = countCommon(string1, string2);
    
    System.out.println("Count of common substrings: " + commonSubsCount);
}
}
