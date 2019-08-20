package com.cts;




public class Login {

    public int loginSum(int a, int b) { 
        return a + b;  
 }
 
 public int loginSubtraction(int a, int b) {
	 int param = 1;
		if (param == 1)
		 System.out.println("foo");
		else if (param == 2)
		 System.out.println("foo");
		else if (param == 1) 
		{// Noncompliant
		  System.out.println("foo");
		}
     return a - b;
 }
 
 public int loginMultiplication(int a, int b) {
        
        return a * b;
 }

 public int loginDivison(int a, int b)  {
               
        return a / b;
 }
 
 public boolean loginEqualIntegers(int a, int b) {
        boolean result = false;
        if (a == b) {
               result = true;
        }

        return result;
 }

	
}
