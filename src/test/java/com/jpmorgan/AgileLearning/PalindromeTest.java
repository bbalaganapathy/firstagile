package com.jpmorgan.AgileLearning;

import junit.framework.TestCase;

public class PalindromeTest extends TestCase {
	
	  
	    public void testApp()
	    {
	        assertTrue(Palindrome.isPalindrome("MALAYALAM"));
	    }
	    
	    public void testApp1()
	    {
	        assertFalse(Palindrome.isPalindrome("MAAMN India "));
	    }
	    
	    public void testException()
	    {
	    	boolean thrown=false;
	    	try {
	    		Palindrome.isPalindrome(null);
	    	  } catch (Exception e) {
	    	    thrown = true;
	    	  }

	    	  assertTrue(thrown);
	       
	    }
	

}
