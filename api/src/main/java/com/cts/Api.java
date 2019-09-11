package com.cts;




public class Api {	
	
	    public int apiSum(int a, int b) {
	    	
	    	int param = 1;
			if (param == 1)
			 System.out.println("foo");
			else if (param == 2)
			 System.out.println("foo");
			else if (param == 1) 
			{// Noncompliant
			  System.out.println("foo");
			}
			
	 
    	         return a + b;  
 }
    public int apiSum2(int a, int b) {
    	
    	 
    		System.out.println(String.format("The value of my integer is %d", "Hello World"));  // Noncompliant; an 'int' is expected rather than a String)

    	int param = 1;
		
        return a + b;  
}
 
 public int apiSubtraction(int a, int b) {
	 
     return a - b;
 }
 
 public int apiMultiplication(int a, int b) {
        return a * b;
 }

 public int apiDivison(int a, int b)  {	 
        return a / b;
 }
 
 public boolean equalIntegers2(int a, int b) {
        boolean result = false;
        if (a == b) {
               result = true;
        }

        return result;
 }

	
}
