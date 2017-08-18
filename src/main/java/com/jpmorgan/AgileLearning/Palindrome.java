package com.jpmorgan.AgileLearning;

public class Palindrome {

	public static boolean isPalindrome(String str) {
		if((str==null)||(str.length()==0))
				throw new IllegalArgumentException();
		return str.equals(new StringBuffer(str).reverse().toString());
	}

}
