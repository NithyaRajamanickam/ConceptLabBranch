package com.cts;




public class Login {

    public int loginSum(int a, int b) { 
        return a + b;  
 }
 
 public int loginSubtraction(int a, int b) {
     return a - b;
 }
 
 public int loginMultiplication(int a, int b) {
	 System.out.println(String.format("The value of my integer is %d", "Hello World"));  // Noncompliant; an 'int' is expected rather than a String)
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
